package com.shashi.walletservice.service;
import com.shashi.walletservice.Util.EmailUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.Date;

import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.IOException;

public class EmailService {
    private static final Logger logger = LoggerFactory.getLogger(EmailService.class);
    public static  final String FROM_EMAIL = "example@gmail.com"; //requires valid gmail id
    public static final String PASSWORD = "*****"; // correct password for gmail id
    public static void sendEmail(String toEmail)
    {
        //final String toEmail = "umangd98@gmail.com"; // can be any email id

        Properties props = getProperties();
        Authenticator auth = getAuthenticator();
        Session session = Session.getDefaultInstance(props, auth);
        logger.info("Session created");
        EmailUtil.sendEmail(session, toEmail,"Mail from e_wallet", "Transaction");
    }

    public static void sendEmailWithAttachments(String host, String port,
                                                final String userName, final String password, String toAddress,
                                                String subject, String message, String attachFiles)
    {
        if(Objects.isNull(subject))
        {
            subject = getDefaultSubject();
        }
        if(Objects.isNull(message))
        {
            message = getDefaultMessage();
        }
        Properties properties = getProperties();
        // creates a new session with an authenticator
        try
        {
            Authenticator auth = getAuthenticator();
            Session session = Session.getInstance(properties, auth);

            // creates a new e-mail message
            Message msg = new MimeMessage(session);

            msg.setFrom(new InternetAddress(userName));
            InternetAddress[] toAddresses = {new InternetAddress(toAddress)};
            msg.setRecipients(Message.RecipientType.TO, toAddresses);
            msg.setSubject(subject);
            msg.setSentDate(new Date());

            // creates message part
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(message, "text/html");

            // creates multi-part
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            // adds attachments
            String filePath = attachFiles;

            MimeBodyPart attachPart = new MimeBodyPart();

            try {
                attachPart.attachFile(filePath);
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            multipart.addBodyPart(attachPart);

            // sets the multi-part as e-mail's content
            msg.setContent(multipart);
            // sends the e-mail
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", FROM_EMAIL, PASSWORD);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
        }
        catch (Exception e)
        {
            logger.info("Email not sent successfully"+e);
        }
    }
    private static Properties getProperties()
    {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        return properties;
    }
    private static Authenticator  getAuthenticator()
    {
        Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FROM_EMAIL, PASSWORD);
            }
        };
        return auth;
    }
    private static String getDefaultSubject()
    {
        String subject = "Mail from e_wallet";
        return subject;
    }

    private static String getDefaultMessage()
    {
        String message = "Please find the attached file of your transaction history!!";
        return message;
    }

}

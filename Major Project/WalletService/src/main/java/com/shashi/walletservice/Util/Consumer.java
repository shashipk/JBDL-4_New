package com.shashi.walletservice.Util;

import com.shashi.walletservice.Model.Transaction;
import com.shashi.walletservice.Model.User;
import com.shashi.walletservice.Repository.TransactionRepository;
import com.shashi.walletservice.service.EmailService;
import com.shashi.walletservice.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class Consumer {
    @Autowired
    private UserService userService;
    @Autowired
    private TransactionRepository trepository;
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);
    @KafkaListener(topics = "test", groupId = "group_id")
    public void consume(String id){

        logger.info(String.format("$$ -> Consumed Message -> %s",id));

        // Checking if the message is for txn History
        if(id.contains("txn")){
            sendTxnHistory(id);
            return;
        }
        int t_id = Integer.parseInt(id);
        Optional<Transaction> transaction = trepository.findById(t_id);
        Transaction transaction1 = transaction.get();
        int amt = transaction1.getAmount();
        User sender = userService.getAUser(String.valueOf(transaction1.getSid()));
        User receiver = userService.getAUser(String.valueOf(transaction1.getRid()));
        EmailService.sendEmail(sender.getEmail());
        EmailService.sendEmail(receiver.getEmail());
    }
    private void sendTxnHistory(String id) {
        String[] arrOfStr = id.split("t", 0);
        String new_id ="";
        for (String a : arrOfStr){
            new_id = a;
            break;
        }
        int id1 = Integer.parseInt(new_id);
        ArrayList<Transaction> list =
                (ArrayList<Transaction>) trepository.findBysidAndrid(id1);

        User user1 = userService.getAUser(String.valueOf(id1));
        String filename ="test.csv";
        try {
            FileWriter fw = new FileWriter(filename);

            for(int i=0;i<list.size();i++) {
                fw.append(list.get(i).getStatus());
                fw.append(',');
                int amt = list.get(i).getAmount();
                Integer obj = amt;
                fw.append(obj.toString());
                fw.append(',');
                fw.append(list.get(i).getDate().toString());
                fw.append(',');
                int id2 = list.get(i).getId();
                Integer obj2 = id2;
                fw.append(obj2.toString());
                fw.append(',');
                int rid = list.get(i).getRid();
                obj = rid;
                fw.append(obj.toString());
                fw.append(',');
                int sid = list.get(i).getSid();
                obj = sid;
                fw.append(obj.toString());
                fw.append('\n');
            }
            fw.flush();
            fw.close();
            logger.info("CSV File is created successfully.");
            EmailService.sendEmailWithAttachments("","",user1.getEmail(),"","toEmail@gmail.com","","",filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

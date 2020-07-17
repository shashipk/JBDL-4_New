package com.shashi.walletservice.Util;

import java.net.URISyntaxException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SmsUtil {
    private static final Logger logger = LoggerFactory.getLogger(SmsUtil.class);
    void sendSms()throws URISyntaxException, UnirestException
    {
        HttpResponse response = Unirest.get("https://www.fast2sms.com/dev/bulk?authorization=64tJZ9QjIHos8cEe70agdDiM2mBFSNvAwp1LfVTbrlPWOqXKkULu20KyCJjAH9vcsTOp4V6k83SfbrgW&sender_id=FSTSMS&message=This%20is%20a%20test%20message&language=english&route=p&numbers=9205834773")
                .header("cache-control", "no-cache")
                .asString();
        logger.info(response.getBody().toString());
        logger.info(response.getHeaders().toString());
    }
}

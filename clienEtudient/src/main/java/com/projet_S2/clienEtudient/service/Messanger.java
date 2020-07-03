package com.projet_S2.clienEtudient.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
@Service
public class Messanger {





   public static final String ACCOUNT_SID =  System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");


    public void sendMessage() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

       Message message = Message.creator(new PhoneNumber("+21625071838"),
                new PhoneNumber("+12058807936"),
                "3aslama ya ejma3a :)").create();


        System.out.println(message.getSid());
    }
};



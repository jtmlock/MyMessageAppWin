package com.example.mymessageappwin;

public class Message {
     String id;
     String senderName;
     String messagePreview;
     String timeSent;

     public Message(String id, String senderName, String messagePreview, String timeSent){
         this.id = id;
         this.senderName = senderName;
         this.messagePreview = messagePreview;
         this.timeSent = timeSent;
     }

}

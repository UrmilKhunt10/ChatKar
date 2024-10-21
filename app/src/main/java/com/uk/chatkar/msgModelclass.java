package com.uk.chatkar;

public class msgModelclass {
    String message;
    String senderid;
    long timeStamp;

    public msgModelclass() {
    }

    public msgModelclass(String message, String senderid, long timestamp) {
        this.message = message;
        this.senderid = senderid;
        this.timeStamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSenderid() {
        return senderid;
    }

    public void setSenderid(String senderid) {
        this.senderid = senderid;
    }

    public long getTimestamp() {
        return timeStamp;
    }

    public void setTimestamp(long timestamp) {
        this.timeStamp = timestamp;
    }
}

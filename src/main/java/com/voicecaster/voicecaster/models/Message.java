package com.voicecaster.voicecaster.models;

public class Message {
    private String voiceMessage;

    public Message() {

    }

    public Message(String voiceMessage) {
        this.voiceMessage = voiceMessage;
    }

    public String getMessage() {
        return voiceMessage;
    }

    public void setName(String voiceMessage) {
        this.voiceMessage = voiceMessage;
    }

}
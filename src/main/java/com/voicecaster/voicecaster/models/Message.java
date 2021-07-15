package com.voicecaster.voicecaster.models;

public class Message {
    private String name;

    public Message() {

    }

    public Message(String name) {
        this.name = name;
    }

    public String getMessage() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
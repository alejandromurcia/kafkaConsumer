package com.uniandes.kafka.models;

public class BaseMessage {
    public String body;

    public BaseMessage() {
        super();
    }

    public BaseMessage(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "BaseMessage [body=" + this.body + "]";
    }
}

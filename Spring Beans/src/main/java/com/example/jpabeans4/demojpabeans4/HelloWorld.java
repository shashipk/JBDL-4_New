package com.example.jpabeans4.demojpabeans4;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class HelloWorld {

    private String msg;

    private String data;

    public HelloWorld(String msg, String data) {
        this.msg = msg;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

//    @Override
//    public String toString() {
//        return "msg = " + this.msg + ", data = " + this.data;
//    }
}

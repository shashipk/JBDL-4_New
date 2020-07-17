package com.shashi.walletservice.Model;

import javax.persistence.*;

public class User {
    private int id;

    private String name;

    private String email;

    private String mobile;

    private Boolean is_kyc_done;

    public Boolean getIs_kyc_done() {
        return is_kyc_done;
    }

    public void setIs_kyc_done(Boolean is_kyc_done) {
        this.is_kyc_done = is_kyc_done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}

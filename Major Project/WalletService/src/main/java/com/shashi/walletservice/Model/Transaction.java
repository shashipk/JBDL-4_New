package com.shashi.walletservice.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Transaction {
    @Id
    @GeneratedValue
    private int id;
    private int amount;
    private int sid;//sender's id
    private int rid;//receiver id
    private Date date;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Transaction() {
    }

    public Transaction(int id, int amount, int sid, int rid, Date date,String status) {
        this.id = id;
        this.amount = amount;
        this.sid = sid;
        this.rid = rid;
        this.date = date;
        this.status=status;
    }
}

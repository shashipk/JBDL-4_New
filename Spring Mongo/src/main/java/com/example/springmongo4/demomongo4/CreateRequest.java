package com.example.springmongo4.demomongo4;

public class CreateRequest {

    private String name;
    private String authorName;
    private int cost;

    private int _count;

    public int get_count() {
        return _count;
    }

    public void set_count(int _count) {
        this._count = _count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

package com.gfg.oop.encapsulation;

public class GeeksForGeeks {

    //instance variables
    private String batches;
    private String courses;

    public GeeksForGeeks(){
        System.out.println("Unparameterized constructor called!");
    }

    public GeeksForGeeks(String batches,String courses){
        this.batches = batches;
        this.courses = courses;

    }

    public String getCourses() {
        return courses;
    }

    public String getBatches(){
        return batches;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
    public void setBatches(String batches){
        this.batches = batches;
    }

    public static void main(String[] args) {
        GeeksForGeeks gfg = new GeeksForGeeks();

        System.out.println("GFG details : \n :- COurse : "+gfg.getCourses() + "\n Batches :- "+gfg.getBatches());
    }


}

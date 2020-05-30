package com.example.Shashi24;

import java.util.HashMap;

public class DataStore {

    private HashMap<String, String> store= new HashMap<String, String>();

    public DataStore (){
        store.put("Sachin","A great batsman");
        store.put("Ramu", " A great man");
        store.put("gfg","great wesite");
    }

    public String getFromDB(String word){
        return store.get(word);
    }
}

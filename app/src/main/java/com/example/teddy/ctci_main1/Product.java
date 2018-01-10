package com.example.teddy.ctci_main1;

/**
 * Created by Teddy on 2018/1/3.
 */

public class Product {
    private int id;
    private String date;
    private String stateTitle;
    private String time;
    private String duration;
    private int state;

    public Product(int id, String date, String stateTitle,String time,String duration, int state){
        this.id = id;
        this.date = date;
        this.stateTitle = stateTitle;
        this.time = time;
        this.duration = duration;
        this.state = state;
    }

    public int getId(){
        return id;
    }

    public String getDate(){
        return date;
    }

    public String getStateTitle(){
        return stateTitle;
    }

    public String getTime(){
        return time;
    }

    public String getDuration(){
        return duration;
    }

    public int getState(){
        return state;
    }
}

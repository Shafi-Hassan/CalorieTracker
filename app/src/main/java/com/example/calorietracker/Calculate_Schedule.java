package com.example.calorietracker;

public class Calculate_Schedule {

    private String Monday;
    private String Tuesday;
    private String Wednesday;
    private String Thursday;
    private String Friday;

    public Calculate_Schedule() {
        Monday = "";
        Tuesday = "";
        Wednesday = "";
        Thursday = "";
        Friday = "";
    }

    public String getMonday(){ return Monday;}
    public String getTuesday(){ return Tuesday;}
    public String getWednesday(){return Wednesday;}
    public String getThursday(){return Thursday;}
    public String getFriday(){return Friday;}


    public void addMonday(String name){ Monday += name;}
    public void addTuesday(String name){ Tuesday += name;}
    public void addWednesday(String name){Wednesday +=  name;}
    public void addThursday(String name){Thursday +=  name;}
    public void addFriday(String name){Friday += name;}


}
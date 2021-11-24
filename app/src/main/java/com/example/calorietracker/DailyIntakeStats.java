package com.example.calorietracker;

import java.time.LocalDate;

public class DailyIntakeStats {

    private int total_calories;
    private int carbs;
    private int fats;
    private int proteins;
    private String name;
    private int age;
    private int height;
    private int weight;

    public DailyIntakeStats() {
        total_calories = 0;
        carbs = 0;
        fats = 0;
        proteins = 0;
        name = "Guest";
    }
    // need to implement feature here to save the daily intake based on a date for Calendar feature
    // have an option to maybe choose the date

    public int getTotal_calories() {
        return total_calories;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getFats() {
        return fats;
    }

    public int getProteins() {
        return proteins;
    }

    public void addCalories(int calories) {
        total_calories += calories;
    }

    public void removeCalories(int calories) {
        total_calories -= calories;
    }

    public void addCarbs(int carbs) {
        this.carbs += carbs;
    }

    public void addFats(int fats) {
        this.fats += fats;
    }

    public void addProteins(int proteins) {
        this.proteins += proteins;
    }

    //i'm just gonna add setting input stuff here for now
    public String getName() {return name; }

    public int getAge() {return age; }

    public int getHeight() {return height; }

    public int getWeight() {return weight; }

    public void addName(String name) {
        this.name = name;
    }

    public void addAge(int age) {
        this.age = age;
    }

    public void addHeight(int height) { this.height = height; }

    public void addWeight(int weight) { this.weight = weight; }
}

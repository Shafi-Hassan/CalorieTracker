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
    private int feet;
    private int inch;
    private int weight;
    private double bmi;
    private double roundedBMI;

    public DailyIntakeStats() {
        total_calories = 0;
        carbs = 0;
        fats = 0;
        proteins = 0;
        name = "Guest";
        bmi = 0;
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

    public int getFeet() {return feet; }

    public int getInch() {return inch;}

    public int getWeight() {return weight; }

    public void addName(String name) {
        this.name = name;
    }

    public void addAge(int age) {
        this.age = age;
    }

    public void addFeet(int feet) { this.feet = feet; }

    public void addInch(int inch){this.inch = inch;}

    public void addWeight(int weight) { this.weight = weight; }

    //method to calculate the BMI with weight and height
    //BMI formula is (kg) / [height (m)]^2
    //height is derived from the feet and inches from user input feet is * 12 to get inches.
    public double calBMI(){
        height = (feet * 12) + inch;
        double meters = (height /39.37);
        double metersSquared = (meters * meters);
        double kg = (weight/2.205);
        bmi = kg / metersSquared;
        roundedBMI = Math.round(bmi*100.0)/100.0;
        return (roundedBMI);
    }
}

package com.example.calorietracker;

public class MealPlan {

    private int calorieGoal;
    private int carbGoal;
    private int proteinGoal;
    private int fatGoal;

    public MealPlan() {
        calorieGoal = 0;
        carbGoal = 0;
        proteinGoal = 0;
        fatGoal = 0;
    }

    public int getCalorieGoal() {
        return calorieGoal;
    }

    public int getCarbGoal() {
        return carbGoal;
    }

    public int getProteinGoal() {
        return proteinGoal;
    }

    public int getFatGoal() {
        return fatGoal;
    }

    public void setCalorieGoal(int cal) {
        calorieGoal = cal;
    }

    public void setCarbGoal(int carb) {
        carbGoal = carb;
    }

    public void setProteinGoal(int protein) {
        proteinGoal = protein;
    }

    public void setFatGoal(int fat) {
        fatGoal = fat;
    }

}

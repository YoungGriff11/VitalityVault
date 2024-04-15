/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitalityvault;

/**
 *
 * @author conor
 */
public class VVH extends VVHGUI{
    public int age, gWeight, cWeight,height, timeframe;
    public double mKcal,cKcal,gKcal,activity,protein,carbs,fats;
    
    public int getHeight() {
        return height;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    String goals, comments,gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    public double getmKcal() {
        return mKcal;
    }


    public double getcKcal() {
        return cKcal;
    }


    public double getgKcal() {
        return gKcal;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getgWeight() {
        return gWeight;
    }

    public void setgWeight(int gWeight) {
        this.gWeight = gWeight;
    }

    public int getcWeight() {
        return cWeight;
    }
    
    public void setcWeight(int cWeight) {
        this.cWeight = cWeight;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public double getActivity() {
        return activity;
    }

    public void setActivity(int activity) {
        this.activity = activity;
    }

    public int getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(int timeframe) {
        this.timeframe = timeframe;
    }
    
}
    
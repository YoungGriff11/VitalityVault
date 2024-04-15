/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitalityvault;

/**
 *
 * @author deand
 */
public class VVCalTracker {

    public String foodItem;
    public int dailyCalIn;
    public int totCalIn;
    public String foodName;

    public VVCalTracker() {
        foodItem = "";
        dailyCalIn = 0;
        totCalIn = 0;
        foodName = "";
    }

    public VVCalTracker(String foodItem, int dailyCalIn, int totCalIn, String foodName) {
        this.foodItem = foodItem;
        this.dailyCalIn = dailyCalIn;
        this.totCalIn = totCalIn;
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public int getDailyCalIn() {
        return dailyCalIn;
    }

    public void setDailyCalIn(int dailyCalIn) {
        this.dailyCalIn = dailyCalIn;
    }
    
    public int getTotCalIn() {
        return totCalIn;
    }

    public void setTotCalIn(int dailyCalIn) {
        this.totCalIn = totCalIn;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

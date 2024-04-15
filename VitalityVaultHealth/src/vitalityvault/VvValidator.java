/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vitalityvault;

/**
 *
 * @author conor
 */
// This code is ment to validate the code but couldnt get to work
public class VvValidator{
    // InputValidator.java

    public class InputValidator {

        public static boolean validateAge(String ageText) {
            try {
                int age = Integer.parseInt(ageText);
                return age > 0; // Age should be a positive integer
            } catch (NumberFormatException e) {
                return false; // Invalid input if parsing fails
            }
        }

        public static boolean validateGender(String genderText) {
            return genderText.equals("1") || genderText.equals("2"); // Gender should be "1" or "2"
        }

        public static boolean validateWeight(String weightText) {
            try {
                double weight = Double.parseDouble(weightText);
                return weight > 0; // Weight should be a positive number
            } catch (NumberFormatException e) {
                return false; // Invalid input if parsing fails
            }
        }

        public static boolean validateHeight(String heightText) {
            try {
                double height = Double.parseDouble(heightText);
                return height > 0; // Height should be a positive number
            } catch (NumberFormatException e) {
                return false; // Invalid input if parsing fails
            }
        }

        public static boolean validateActivity(String activityText) {
            try {
                double activity = Double.parseDouble(activityText);
                return activity >= 0; // Activity can be zero or positive
            } catch (NumberFormatException e) {
                return false; // Invalid input if parsing fails
            }
        }
    }

}

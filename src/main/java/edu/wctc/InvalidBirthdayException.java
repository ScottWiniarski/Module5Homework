package edu.wctc;

public class InvalidBirthdayException extends Exception {

    public InvalidBirthdayException(int year, int month, int day) {
        super("That birthdate is invalid.");

        /*if (year > 9999 || year < 1000){
            System.out.println("The year is invalid");
        }
        if(month > 12 || month < 0){
            System.out.println("The month is invalid");
        }
        if(day > 32 || day < 0){
            System.out.println("The day is invalid");
        }
        if(month == 2 && day < 28){
            System.out.println("The given day in Feburary is invalid.");
        }*/


    }
}

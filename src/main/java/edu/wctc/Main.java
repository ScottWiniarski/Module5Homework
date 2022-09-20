package edu.wctc;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MonthDayGenderUtility birthgen = new MonthDayGenderUtility();
        LastNameUtility lNameU = new LastNameUtility();
        FirstNameUtility firstName = new FirstNameUtility();

        Scanner kb = new Scanner(System.in);

        System.out.println("What is your first name? ");
        String fName = kb.nextLine();//.toUpperCase();
        //String fName = fame.substring(0, 1).toUpperCase() + fame.substring(1);
        //System.out.println(fName);

        System.out.println("What is your middle initial, if you have one? ");
        String middleInitial = kb.nextLine();
        //String middleInitial = initial.toUpperCase().substring(0,1);
        //System.out.println(middleInitial);

        System.out.println("What is your last name? ");
        String lName = kb.nextLine();
        //String lName = lame.substring(0, 1).toUpperCase() + lame.substring(1);
        //System.out.println(lName);

        System.out.println("What year were you born?");
        int birthyear = kb.nextInt();
        System.out.println("What month were you born in? ");
        int bmonth = kb.nextInt();
        System.out.println("What day of the month? ");
        int bday = kb.nextInt();
        System.out.println("What is your gender code? (M or F)");
        char gCode = kb.next().toUpperCase(Locale.ROOT).charAt(0);


        try {
            //String lName = lame.substring(0, 1).toUpperCase() + lame.substring(1);
            //String middleInitial = initial.toUpperCase().substring(0,1);

            String newSS = lNameU.encodeLastName(lName);
            int firstNameVal = firstName.EncodeFirstName(fName, middleInitial);

            //taking the birthyear, converting to a string and getting the last two "numbers" then parsing back into an integer.
            String yy = String.valueOf(birthyear).substring(2);
            int YY = Integer.parseInt(yy);

            int DDD = birthgen.encodeMonthDayGender(birthyear, bmonth, bday, gCode);

            // have to pass in NN, but the overflow is dependent on the formatters not the actual main.
            DriversLicense driversLicense = new DriversLicense(newSS, firstNameVal, YY, DDD, 0);

            WisonsinFormatter WisFor = new WisonsinFormatter();
            System.out.println("Wisconsin: " + WisFor.formatLicenseNumber(driversLicense));

            FloridaFormatter FloFor = new FloridaFormatter();
            System.out.println("Florida: " + FloFor.formatLicenseNumber(driversLicense));

        } catch (InvalidBirthdayException | MissingNameException | UnknownGenderCodeException e) {
            System.out.println(e);
        }

    }
}
package edu.wctc;

//SSSS-FFF-YY-DDD-N

import java.util.ArrayList;

public class FloridaFormatter implements DriversLicenseFormatter {
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {
        ArrayList<String> drivers = new ArrayList<>();

        String SS = driversLicense.getSSSS();
        drivers.add(SS);
        String FF = String.valueOf(driversLicense.getFFF());
        drivers.add(FF);
        String YY = String.valueOf(driversLicense.getYY());
        drivers.add(YY);
        String DDD = String.valueOf(driversLicense.getDDD());
        drivers.add(DDD);
        String N = String.valueOf(driversLicense.getNN());
        String n2 = N.substring(0,1);
        drivers.add(n2);

        //SSSS-FFF-YY-DDD-N
        return SS + "-" + FF + "-" + YY + "-" + DDD + "-" + n2;
    }
}

package edu.wctc;

import java.util.ArrayList;
import java.util.Arrays;

public class WisonsinFormatter implements DriversLicenseFormatter {

    //SSSS-FFFY-YDDD-NN
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {

        String[] year2 = new String[3];

        String SS = driversLicense.getSSSS();

        String FF = String.valueOf(driversLicense.getFFF());

        String YY = String.valueOf(driversLicense.getYY());
        String year =  YY.substring(0,1);
        String syear = YY.substring(1);


        String DDD = String.valueOf(driversLicense.getDDD());

        String NN = String.valueOf(driversLicense.getNN());


        return SS + "-" + FF + year + "-" + syear + DDD + "-" + NN + NN;
    }
}

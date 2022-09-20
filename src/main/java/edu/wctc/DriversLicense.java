package edu.wctc;

public class DriversLicense {
    private String SSSS; //(or soundexCode)
    private int FFF; //(or firstNameMiddleInitial)
    private int YY; // Or birthYear
    private int DDD; //(or birthMonthDayGender)
    private int NN; // (or overflow)

    public DriversLicense(String SSSS, int FFF, int YY, int DDD, int NN) {
        this.SSSS = SSSS;
        this.FFF = FFF;
        this.YY = YY;
        this.DDD = DDD;
        this.NN = NN;
    }

    public String getSSSS() {
        return SSSS;
    }

    public void setSSSS(String SSSS) {
        this.SSSS = SSSS;
    }

    public int getFFF() {
        return FFF;
    }

    public void setFFF(int FFF) {
        this.FFF = FFF;
    }

    public int getYY() {
        return YY;
    }

    public void setYY(int YY) {
        this.YY = YY;
    }

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public int getNN() {
        return NN;
    }

    public void setNN(int NN) {
        this.NN = NN;
    }
}

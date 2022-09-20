package edu.wctc;

public class UnknownGenderCodeException extends Exception {
    public UnknownGenderCodeException(char genderCode) {
        super(String.format("%s is an unknown gender-code", genderCode));
    }

}

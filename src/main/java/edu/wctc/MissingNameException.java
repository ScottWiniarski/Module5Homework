package edu.wctc;

public class MissingNameException extends Exception {
    public MissingNameException(String nameType) {
        super(String.format("That %s is missing.", nameType));
        /*if (nameType.isEmpty()) {
            System.out.println("That name is invalid");
        }*/

    }
}

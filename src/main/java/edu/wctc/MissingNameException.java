package edu.wctc;

public class MissingNameException extends Exception {
    public MissingNameException(String nameType) {
        super("That {} is invalid.".formatted(nameType));
        /*if (nameType.isEmpty()) {
            System.out.println("That name is invalid");
        }*/

    }
}

package day27exceptions;

public class IllegalNameException extends RuntimeException {
    public IllegalNameException(String message) {//runtime exception


        super(message);

    }
}
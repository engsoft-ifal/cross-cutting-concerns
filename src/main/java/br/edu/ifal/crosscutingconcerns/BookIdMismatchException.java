package br.edu.ifal.crosscutingconcerns;

public class BookIdMismatchException extends RuntimeException{
    public BookIdMismatchException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookIdMismatchException(String message) {
        super(message);
    }

}

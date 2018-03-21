package ua.training.exception;

public class NotUniqueException extends Exception {
    @Override
    public String getMessage() {
        return "Value is not unique. Please enter a new value";
    }
}

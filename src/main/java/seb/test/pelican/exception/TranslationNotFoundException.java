package seb.test.pelican.exception;

public class TranslationNotFoundException {
    private String message;

    public TranslationNotFoundException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

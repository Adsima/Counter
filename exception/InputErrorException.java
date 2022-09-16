package calculate.exception;

public class InputErrorException extends Exception {
    public InputErrorException() {
    }

    public InputErrorException(String message) {
        super(message);
    }
}

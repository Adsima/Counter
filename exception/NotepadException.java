package calculate.exception;

public class NotepadException extends Exception {
    public NotepadException(String message) {
        super(message);
    }

    public NotepadException(String message, Throwable cause) {
        super(message, cause);
    }
}

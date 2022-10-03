package calculate.validator;

public interface Validator {

    default boolean validate(String value) {
        if (value != null && isAlpha(value)) {
            return true;
        } else {
            return false;
        }
    }

    boolean isAlpha(String input);
}

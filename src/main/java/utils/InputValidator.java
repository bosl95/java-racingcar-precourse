package utils;

import utils.exception.DuplicateCarNameException;
import utils.exception.InvalidCarNameException;

import java.util.Arrays;
import java.util.regex.Pattern;

public class InputValidator {
    private static String CAR_NAME_PATTERN = "^[0-9가-힣a-zA-Z]*$";
    private static String DELIMITER = ",";

    public static void validNameInput(String input) {
        isCharacter(input);
        validDelimiter(input);
        isDuplicateName(input);
    }

    private static void isCharacter(String input) {
        if (!Pattern.matches(CAR_NAME_PATTERN, input)) {
            throw new InvalidCarNameException();
        }
    }

    private static void validDelimiter(String input) {
        if (input.startsWith(DELIMITER) || input.endsWith(DELIMITER)) {
            throw new InvalidCarNameException();
        }
    }

    public static void isDistinctName(String input) {
        if (isDuplicateName(input)) {
            throw new DuplicateCarNameException();
        }
    }

    private static boolean isDuplicateName(String input) {
        return Arrays.stream(input.split(DELIMITER))
                .distinct()
                .equals(input.split(DELIMITER).length);
    }
}

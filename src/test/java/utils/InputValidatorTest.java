package utils;

import org.junit.jupiter.api.Test;
import utils.exception.DuplicateCarNameException;
import utils.exception.InvalidCarNameException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class InputValidatorTest {
    @Test
    void validNameInput() {
        String input = ",이름1";
        assertThrows(InvalidCarNameException.class ,
                () -> InputValidator.validNameInput(input));

        assertThrows(InvalidCarNameException.class ,
                () -> InputValidator.validNameInput("이름1,이름2,"));

        assertThrows(InvalidCarNameException.class ,
                () -> InputValidator.validNameInput(" "));

        assertThrows(InvalidCarNameException.class ,
                () -> InputValidator.validNameInput("이름1, 이름2,이름3"));
    }

    @Test
    void isDistinctName() {
        assertThrows(DuplicateCarNameException.class,
                () -> InputValidator.isDistinctName("이름1,이름1,이름2"));
    }
}
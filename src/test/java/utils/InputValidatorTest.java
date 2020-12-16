package utils;

import org.junit.jupiter.api.Test;
import utils.exception.DuplicateCarNameException;
import utils.exception.InvalidCarNameException;
import utils.exception.InvalidRangeTimeException;
import utils.exception.NotNumberException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InputValidatorTest {
    @Test
    void 정상적인_이름_입력() {
        assertDoesNotThrow(() -> InputValidator.validNameInput("이름1"));
        assertDoesNotThrow(() -> InputValidator.validNameInput("이름1,이름2,이름3"));
    }

    @Test
    void 맨_앞에_구분자_입력() {
        assertThrows(InvalidCarNameException.class ,
                () -> InputValidator.validNameInput(",이름1"));
    }

    @Test
    void 맨_뒤에_구분자_입력() {
        assertThrows(InvalidCarNameException.class ,
                () -> InputValidator.validNameInput("이름1,이름2,"));
    }

    @Test
    void 공백_입력() {
        assertThrows(InvalidCarNameException.class ,
                () -> InputValidator.validNameInput(" "));
    }

    @Test
    void 이름_사이에_공백_입력() {
        assertThrows(InvalidCarNameException.class ,
                () -> InputValidator.validNameInput("이름1, 이름2,이름3"));
    }

    @Test
    void 이름이_중복되는_경우() {
        assertDoesNotThrow(() -> InputValidator.isDistinctName("이름1,이름2,이름3"));
        assertThrows(DuplicateCarNameException.class,
                () -> InputValidator.isDistinctName("이름1,이름1,이름2"));
    }

    @Test
    void 횟수가_잘못_입력된_경우() {
        assertThrows(NotNumberException.class,
                () -> InputValidator.validTimeInput("삼"));
        assertThrows(NotNumberException.class,
                () -> InputValidator.validTimeInput("^"));
        assertThrows(NotNumberException.class,
                () -> InputValidator.validTimeInput(" "));
        assertThrows(InvalidRangeTimeException.class,
                () -> InputValidator.validTimeInput("-1"));
        assertThrows(InvalidRangeTimeException.class,
                () -> InputValidator.validTimeInput("0"));
    }

    @Test
    void 횟수가_제대로_입력된_경우() {
        assertDoesNotThrow(() -> InputValidator.validTimeInput("3"));
        assertDoesNotThrow(() -> InputValidator.validTimeInput("9"));
    }
}
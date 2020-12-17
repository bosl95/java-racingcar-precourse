package utils;

import org.junit.jupiter.api.Test;
import utils.exception.DuplicateCarNameException;
import utils.exception.InvalidCarNameException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NameValidatorTest {
    @Test
    void 정상적인_이름_입력() {
        assertDoesNotThrow(() -> NameValidator.invalidName("이름1"));
        assertDoesNotThrow(() -> NameValidator.invalidName("이름1,이름2,이름3"));
    }

    @Test
    void 맨_앞에_구분자_입력() {
        assertThrows(InvalidCarNameException.class ,
                () -> NameValidator.invalidName(",이름1"));
    }

    @Test
    void 맨_뒤에_구분자_입력() {
        assertThrows(InvalidCarNameException.class ,
                () -> NameValidator.invalidName("이름1,이름2,"));
    }

    @Test
    void 공백_입력() {
        assertThrows(InvalidCarNameException.class ,
                () -> NameValidator.invalidName(" "));
    }

    @Test
    void 이름_사이에_공백_입력() {
        assertThrows(InvalidCarNameException.class ,
                () -> NameValidator.invalidName("이름1, 이름2,이름3"));
    }

    @Test
    void 이름이_중복되는_경우() {
        assertDoesNotThrow(() -> NameValidator.invalidName("이름1,이름2,이름3"));
        assertThrows(DuplicateCarNameException.class,
                () -> NameValidator.invalidName("이름1,이름1,이름2"));
    }
}
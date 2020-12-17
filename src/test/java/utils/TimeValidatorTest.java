package utils;

import org.junit.jupiter.api.Test;
import racingcar.domain.Time;
import utils.exception.InvalidRangeTimeException;
import utils.exception.NotNumberException;

import static org.junit.jupiter.api.Assertions.*;

class TimeValidatorTest {
    @Test
    void 횟수가_잘못_입력된_경우() {
        assertThrows(NotNumberException.class,
                () -> Time.validTimeInput("삼"));
        assertThrows(NotNumberException.class,
                () -> Time.validTimeInput("^"));
        assertThrows(NotNumberException.class,
                () -> Time.validTimeInput(" "));
        assertThrows(InvalidRangeTimeException.class,
                () -> Time.validTimeInput("-1"));
        assertThrows(InvalidRangeTimeException.class,
                () -> Time.validTimeInput("0"));
    }

    @Test
    void 횟수가_제대로_입력된_경우() {
        assertDoesNotThrow(() -> Time.validTimeInput("3"));
        assertDoesNotThrow(() -> Time.validTimeInput("9"));
    }
}
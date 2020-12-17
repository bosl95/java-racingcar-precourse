package racingcar.domain;

import org.junit.jupiter.api.Test;
import utils.exception.NotNumberException;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
    void 횟수를_제대로_입력한_경우() {
        assertDoesNotThrow(() -> new Time("8"));
    }

    @Test
    void 횟수를_잘못_입력한_경우() {
        assertThrows(NotNumberException.class, () -> new Time("호"));
    }
}
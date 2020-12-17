package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomGeneratorTest {
    @Test
    void 랜덤_숫자_생성() {
        int random = RandomGenerator.execute();
        assertTrue(0 <= random || random <= 9);
    }
}
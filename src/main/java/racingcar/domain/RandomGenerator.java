package racingcar.domain;

import utils.RandomUtils;

public class RandomGenerator {
    private static int MIN_NUMBER = 0;
    private static int MAX_NUMBER = 9;

    public static int execute() {
        return RandomUtils.nextInt(MIN_NUMBER, MAX_NUMBER);
    }
}

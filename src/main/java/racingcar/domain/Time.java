package racingcar.domain;

import utils.TimeValidator;
import utils.exception.InvalidRangeTimeException;
import utils.exception.NotNumberException;

public class Time {
    public static int TIMEOUT = 0;
    private int time;

    public Time(String time) {
        Time.validTimeInput(time);
        this.time = Integer.parseInt(time);
    }

    public static void validTimeInput(String time) {
        if (TimeValidator.isInteger(time)) {
            throw new NotNumberException();
        }

        if (TimeValidator.isBelowZero(time)) {
            throw new InvalidRangeTimeException();
        }
    }

    public int count() {
        return --time;
    }
}

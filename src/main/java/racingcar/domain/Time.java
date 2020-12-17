package racingcar.domain;

import utils.TimeValidator;
import utils.exception.InvalidRangeTimeException;
import utils.exception.NotNumberException;

public class Time {
    private String time;

    public Time(String time) {
        Time.validTimeInput(time);
        this.time = time;
    }

    public static void validTimeInput(String time) {
        if (TimeValidator.isInteger(time)) {
            throw new NotNumberException();
        }

        if (TimeValidator.isBelowZero(time)) {
            throw new InvalidRangeTimeException();
        }
    }

    public int getTime() {
        return Integer.parseInt(time);
    }
}

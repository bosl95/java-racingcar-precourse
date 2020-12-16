package utils.exception;

import racingcar.view.ErrorOutputView;

public class InvalidRangeTimeException extends RuntimeException {
    public InvalidRangeTimeException() {
        ErrorOutputView.invalidRangeTime();
    }
}

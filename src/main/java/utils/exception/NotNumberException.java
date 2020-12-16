package utils.exception;

import racingcar.view.ErrorOutputView;

public class NotNumberException extends RuntimeException {
    public NotNumberException() {
        ErrorOutputView.invalidTime();
    }
}

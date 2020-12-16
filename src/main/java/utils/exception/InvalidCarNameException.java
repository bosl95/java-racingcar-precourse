package utils.exception;

import racingcar.view.ErrorOutputView;

public class InvalidCarNameException extends RuntimeException {
    public InvalidCarNameException() {
        ErrorOutputView.invalidCarName();
    }
}

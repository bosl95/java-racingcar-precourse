package utils.exception;

import racingcar.view.ErrorOutputView;

public class DuplicateCarNameException extends RuntimeException {
    public DuplicateCarNameException() {
        ErrorOutputView.duplicateCarName();
    }
}

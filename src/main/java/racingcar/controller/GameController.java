package racingcar.controller;

import racingcar.view.InputView;
import racingcar.view.OutputView;
import utils.InputValidator;

public class GameController {
    private String time;

    public void start() {
        inputCarName();
        inputTimes();
    }

    private void inputCarName() {
        while (true) {
            try {
                CarController.askCarName();
                break;
            } catch (NullPointerException e) {
                // 예외 시 다시 입력
            }
        }
    }

    private void inputTimes() {
        OutputView.askTimes();
        try {
            String input = InputView.input();
            InputValidator.validTimeInput(input);
            time = input;
        } catch (NullPointerException e) {
            inputTimes();
        }
    }
}

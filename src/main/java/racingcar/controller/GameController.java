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
        try {
            CarController.askCarName();
        } catch (NullPointerException e) {
            inputCarName();
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

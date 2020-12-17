package racingcar.controller;

import racingcar.view.InputView;
import racingcar.view.OutputView;
import utils.InputValidator;

import java.util.List;

public class GameController {
    private int time;

    public void start() {
        inputCarName();
        inputTimes();
        startRound();
        findWinner();
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
            time = Integer.valueOf(input);
        } catch (NullPointerException e) {
            inputTimes();
        }
    }

    private void startRound() {
        while (--time >= 0) {
            List<String> state = CarController.startRound();
            OutputView.showState(state);
        }
    }

    private void findWinner() {
        List<String> winner = CarController.findWinner();
        OutputView.showWinner(winner);
    }
}

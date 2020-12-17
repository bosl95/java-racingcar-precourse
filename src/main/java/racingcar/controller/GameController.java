package racingcar.controller;

import racingcar.domain.Time;
import racingcar.view.InputView;
import racingcar.view.OutputView;

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
            Time time = new Time(InputView.input());
            this.time = time.getTime();
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

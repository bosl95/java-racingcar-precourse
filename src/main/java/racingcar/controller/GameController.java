package racingcar.controller;

import racingcar.domain.Time;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class GameController {
    private Time time;

    public void start() {
        inputCarName();
        inputTimes();
        eachRoundStart();
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
            time = new Time(InputView.input());
        } catch (NullPointerException e) {
            inputTimes();
        }
    }

    private void eachRoundStart() {
        while (time.count() >= 0) {
            List<String> state = CarController.startRound();
            OutputView.showState(state);
        }
    }

    private void findWinner() {
        List<String> winner = CarController.findWinner();
        OutputView.showWinner(winner);
    }
}
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
        try {
            time = new Time(InputView.inputTime());
        } catch (NullPointerException e) {
            inputTimes();
        }
    }

    private void eachRoundStart() {
        while (time.count() >= time.TIMEOUT) {
            List<String> state = CarController.startRound();
            OutputView.showState(state);
        }
    }

    private void findWinner() {
        CarController.findWinner();
    }
}
package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import utils.InputValidator;
import utils.exception.DuplicateCarNameException;
import utils.exception.InvalidCarNameException;

import java.util.List;

public class CarController {
    static final Cars cars = new Cars();

    public static void askCarName() {
        OutputView.askCarName();
        try {
            String input = InputView.input();
            InputValidator.validNameInput(input);
            InputValidator.isDistinctName(input);
            cars.add(input, InputValidator.DELIMITER);
        } catch (InvalidCarNameException | DuplicateCarNameException e) {
            throw new NullPointerException();
        }
    }

    public static List<String> startRound() {
        cars.moveForward();
        return showState();
    }

    private static List<String> showState() {
        return cars.states();
    }

    public static List<String> findWinner() {
        return cars.getWinner();
    }
}

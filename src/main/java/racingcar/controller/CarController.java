package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import utils.NameValidator;
import utils.exception.DuplicateCarNameException;
import utils.exception.InvalidCarNameException;

import java.util.List;

public class CarController {
    static final Cars cars = new Cars();

    public static void askCarName() {
        try {
            String input = InputView.inputName();
            cars.add(input, NameValidator.DELIMITER);
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

    public static void findWinner() {
        OutputView.showWinner(cars.getWinner());
    }
}
package racingcar.controller;

import racingcar.view.InputView;
import racingcar.view.OutputView;
import utils.InputValidator;
import utils.exception.InvalidCarNameException;

public class CarController {

    public static String askCarName() {
        OutputView.askCarName();
        try {
            String input = InputView.input();
            InputValidator.validNameInput(input);
            InputValidator.isDistinctName(input);
            return input;
        } catch (InvalidCarNameException e) {
            throw new NullPointerException();
        }

    }
}

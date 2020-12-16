package racingcar.controller;

public class GameController {
    public void start() {
        while (true) {
            inputCarName();
        }
    }

    private void inputCarName() {
        String name = null;
        try {
            name = CarController.askCarName();
        } catch (NullPointerException e) {

        }

    }
}

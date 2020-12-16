package racingcar.controller;

public class GameController {
    public void start() {
        inputCarName();
    }

    private void inputCarName() {
        while (true) {
            String name = null;
            try {
                name = CarController.askCarName();
                break;
            } catch (NullPointerException e) {
                // 예외 시 다시 입력
            }
        }
    }
}

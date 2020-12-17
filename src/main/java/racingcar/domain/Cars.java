package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    final List<Car> carList = new ArrayList<>();
    static int forwardPoint = 4;
    int maxPosition = -1;

    public void add(String input, String delimiter) {
        carList.addAll(Arrays.stream(input.split(delimiter))
                .map(name -> new Car(name))
                .collect(Collectors.toList()));
    }

    public void moveForward() {
        carList.stream()
                .forEach(car -> {
                    if (RandomGenerator.execute() >= forwardPoint) {
                        car.move();
                    }
                });
    }

    public List<String> states() {
        return carList.stream()
                .map(car -> car.getState())
                .collect(Collectors.toList());
    }

    public List<String> getWinner() {
        findMaxPosition();
        return carList.stream()
                .filter(car -> car.isMaxPosition(maxPosition))
                .map(car -> car.getName())
                .collect(Collectors.toList());
    }

    private void findMaxPosition() {
        carList.stream()
                .forEach(car -> {
                    maxPosition = car.comparePosition(maxPosition);
                });
    }
}

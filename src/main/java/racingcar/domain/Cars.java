package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    final List<Car> carList = new ArrayList<>();

    public void add(String input, String delimiter) {
        carList.addAll(Arrays.stream(input.split(delimiter))
                .map(name -> new Car(name))
                .collect(Collectors.toList()));
    }
}

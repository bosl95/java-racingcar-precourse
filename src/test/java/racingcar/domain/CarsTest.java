package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarsTest {
    Cars cars = new Cars();

    @Test
    void 차_정상_추가() {
        String input = "이름1,이름2,이름3";
        List<String> list = Arrays.asList(input.split(","));
        cars.add(input, ",");
        for (Car car : cars.carList) {
            assertTrue(list.contains(car.getName()));
        }
    }
}
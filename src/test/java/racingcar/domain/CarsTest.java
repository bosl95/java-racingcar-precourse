package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class CarsTest {
    Cars cars = new Cars();

    @Test
    void 차_정상_추가() {
        String input = "이름1,이름2,이름3";
//        carList.addAll(Arrays.asList(new Car("이름1"), new Car("이름2"), new Car("이름3")));
        cars.add(input, ",");
    }
}
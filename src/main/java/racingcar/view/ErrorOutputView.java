package racingcar.view;

import static racingcar.view.OutputView.*;

public class ErrorOutputView {
    private static String ERROR_SYMBOL = "[ERROR] ";
    private static String INVALID_CAR_NAME = "자동차 이름 입력이 잘못 되었습니다.\n\n";
    private static String DUPLICATE_CAR_NAME = "자동차 이름이 중복됩니다.\n\n";
    private static String INVALID_TIMES = "자동차 이름이 중복됩니다.\n\n";
    private static String INVALID_TIME_RANGE = "횟수의 범위를 초과하였습니다.\n\n";

    public static void invalidCarName() {
        appendSymbol();
        stringBuilder.append(INVALID_CAR_NAME);
        print();
    }

    public static void duplicateCarName() {
        appendSymbol();
        stringBuilder.append(DUPLICATE_CAR_NAME);
        print();
    }

    public static void invalidTime() {
        appendSymbol();
        stringBuilder.append(INVALID_TIMES);
        print();
    }

    public static void invalidRangeTime() {
        appendSymbol();
        stringBuilder.append(INVALID_TIME_RANGE);
        print();
    }

    private static void appendSymbol() {
        stringBuilder.append(ERROR_SYMBOL);
    }
}

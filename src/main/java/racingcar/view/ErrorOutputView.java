package racingcar.view;

import static racingcar.view.OutputView.*;

public class ErrorOutputView {
    private static String ERROR_SYMBOL = "[ERROR] ";
    private static String INVALID_CAR_NAME = "자동차 이름 입력이 잘못 되었습니다.\n";
    private static String DUPLICATE_CAR_NAME = "자동차 이름이 중복됩니다.\n";

    public static void invalidCarName() {
        stringBuilder.append(ERROR_SYMBOL);
        stringBuilder.append(INVALID_CAR_NAME);
        print();
    }

    public static void duplicateCarName() {
        stringBuilder.append(ERROR_SYMBOL);
        stringBuilder.append(DUPLICATE_CAR_NAME);
        print();
    }
}

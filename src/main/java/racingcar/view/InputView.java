package racingcar.view;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputName() {
        OutputView.askCarName();
        return scanner.nextLine();
    }

    public static String inputTime() {
        OutputView.askTimes();
        return scanner.nextLine();
    }
}

package racingcar.view;

public class OutputView {
    static final StringBuilder stringBuilder = new StringBuilder();
    private static String ASK_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)\n";
    private static String ASK_TIME = "시도할 횟수를 입력하세요\n";

    public static void askCarName() {
        stringBuilder.append(ASK_CAR_NAME);
        print();
    }

    static void print(){
        System.out.print(stringBuilder.toString());
        reset();
    }

    private static void reset() {
        stringBuilder.setLength(0);
    }

    public static void askTimes() {
        stringBuilder.append(ASK_TIME);
        print();
    }
}

package racingcar.domain;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        this.position++;
    }

    String getState() {
        return name + " : " + repeat("-", position);
    }

    private String repeat(String str, int num) {
        return new String(new char[num]).replace("\0", str);
    }

    String getName() {
        return this.name;
    }

    int getPosition() {
        return position;
    }

    boolean aboveMaxPosition(int position) {
        return this.position >= position;
    }

    boolean isMaxPosition(int maxPosition) {
        return this.position == maxPosition;
    }
}

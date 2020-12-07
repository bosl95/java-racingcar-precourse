package racingcar.domain;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " : " + "-".repeat(position) + "\n";
    }

    void move() {
        this.position += 1;
    }

    public boolean isMaxPosition(int lastMaxPosition) {
        return this.position > lastMaxPosition;
    }
}

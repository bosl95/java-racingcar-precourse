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

    public String getState() {
        return this.name + " : " + new String(new char[this.position]).replace("\0", "-");
    }

    public String getName() {
        return this.name;
    }

    int getPosition() {
        return position;
    }

    public boolean aboveMaxPosition(int position) {
        return this.position >= position;
    }

    public boolean isMaxPosition(int maxPosition) {
        return this.position == maxPosition;
    }
}

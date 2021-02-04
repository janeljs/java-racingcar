package racingcar.domain;

public class Position {
    private int position;

    public Position(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void move(int value) {
        this.position += value;
    }
}

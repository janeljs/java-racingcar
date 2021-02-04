package racingcar.domain;

public class Car {
    private static final String MARKER_BETWEEN_NAME_AND_POSITION = " : ";
    private static final String MARKER_OF_POSITION = "-";

    private final Name name;
    private Position position;

    public Car(Name name) {
        this.name = name;
        this.position = new Position(0);
    }

    public void movePosition(int value) {
        position.move(value);
    }

    public String getCurrentPosition() {
        StringBuilder current = new StringBuilder(name.getName());
        current.append(MARKER_BETWEEN_NAME_AND_POSITION);
        for (int i = 0; i < position.getPosition(); i++) {
            current.append(MARKER_OF_POSITION);
        }
        return current.toString();
    }
}

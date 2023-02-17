package OOP;

public enum Position {
    FRONT_LEFT("front-left"),
    FRONT_RIGHT("front-right"),
    REAR_LEFT("rear-left"),
    REAR_RIGHT("rear-right");

    private final String value;

    Position(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

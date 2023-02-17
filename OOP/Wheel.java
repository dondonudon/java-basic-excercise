package OOP;

abstract class Wheel {
    String name;
    Position position;

    abstract void spin();

    abstract void stop();

    String getName() {
        return this.name + "-" + this.position.getValue();
    }
}

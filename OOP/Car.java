package OOP;

import java.util.List;

abstract class Car {
    protected String name;
    protected List<Wheel> wheels;

    abstract void drive();

    abstract void stop();

    abstract void addWheel(Wheel wheel);

    String getName() {
        return this.name;
    }
}

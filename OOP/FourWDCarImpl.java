package OOP;

import java.util.ArrayList;

public class FourWDCarImpl extends Car {

    public FourWDCarImpl(String name) {
        this.name = name;
        this.wheels = new ArrayList<>();
    }

    void drive() {
        wheels.forEach(Wheel::spin);
    }

    void stop() {
        wheels.forEach(Wheel::stop);
    }

    @Override
    void addWheel(Wheel wheel) {
        this.wheels.add(wheel);
    }
}

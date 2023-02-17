package OOP;

import java.util.ArrayList;

public class FrontWDCarImpl extends Car {
    public FrontWDCarImpl(String name) {
        this.name = name;
        this.wheels = new ArrayList<>();
    }

    void drive() {
        wheels.stream().filter(wheel -> wheel.position == Position.FRONT_RIGHT || wheel.position == Position.FRONT_LEFT)
                .forEach(Wheel::spin);

        wheels.stream().filter(wheel -> wheel.position == Position.REAR_LEFT || wheel.position == Position.REAR_RIGHT)
                .forEach(Wheel::spin);
    }

    void stop() {
        wheels.stream().filter(wheel -> wheel.position == Position.FRONT_RIGHT || wheel.position == Position.FRONT_LEFT)
                .forEach(Wheel::stop);

        wheels.stream().filter(wheel -> wheel.position == Position.REAR_LEFT || wheel.position == Position.REAR_RIGHT)
                .forEach(Wheel::stop);
    }

    @Override
    void addWheel(Wheel wheel) {
        this.wheels.add(wheel);
    }
}

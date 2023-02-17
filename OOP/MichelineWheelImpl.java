package OOP;

public class MichelineWheelImpl extends Wheel {
    public MichelineWheelImpl(Position position) {
        this.name = "Micheline";
        this.position = position;
    }

    void spin() {
        System.out.println(this.getName() + " is spinning");
    }

    void stop() {
        System.out.println(this.getName() + " is stopping");
    }
}

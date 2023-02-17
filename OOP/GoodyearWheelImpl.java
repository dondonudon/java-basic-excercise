package OOP;

public class GoodyearWheelImpl extends Wheel {
    public GoodyearWheelImpl(Position position) {
        this.name = "Good year";
        this.position = position;
    }

    void spin() {
        System.out.println("Spinning " + this.getName());
    }

    void stop() {
        System.out.println("Stopping " + this.getName());
    }
}

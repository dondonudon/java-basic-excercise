package OOP;

public class Main {
    public static void main(String[] args) {
        Car car = new FourWDCarImpl("Mutsibishi Pajero");
        car.addWheel(new MichelineWheelImpl(Position.FRONT_LEFT));
        car.addWheel(new MichelineWheelImpl(Position.FRONT_RIGHT));
        car.addWheel(new GoodyearWheelImpl(Position.REAR_LEFT));
        car.addWheel(new GoodyearWheelImpl(Position.REAR_RIGHT));

        System.out.print("\n");

        NagivationControlService.BeginDriveSequence(car, 10);

        car = new FrontWDCarImpl("Mitsubishi Xpander");
        car.addWheel(new MichelineWheelImpl(Position.FRONT_LEFT));
        car.addWheel(new MichelineWheelImpl(Position.FRONT_RIGHT));
        car.addWheel(new GoodyearWheelImpl(Position.REAR_LEFT));
        car.addWheel(new GoodyearWheelImpl(Position.REAR_RIGHT));

        NagivationControlService.BeginDriveSequence(car, 10);
    }
}

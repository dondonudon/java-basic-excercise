package OOP;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NagivationControlService {
    public static void BeginDriveSequence(Car car, int waitTimeSecond) {
        try {
            Date start = new Date();
            int waitTimeMilliSeconds = waitTimeSecond * 1000;

            System.out.println("Car " + car.getName() + " starting...");
            Thread.sleep(waitTimeMilliSeconds / 4);
            System.out.println("Car " + car.getName() + " driving...");
            car.drive();

            System.out.println("Car " + car.getName() + " will drive for " + waitTimeSecond + " seconds");
            Thread.sleep(waitTimeMilliSeconds);
            long duration = new Date().getTime() - start.getTime();

            car.stop();
            System.out.println("Car " + car.getName() + " stopped after "
                    + TimeUnit.SECONDS.convert(duration, TimeUnit.MILLISECONDS) + " seconds of driving");
        } catch (InterruptedException ex) {
            System.out.println("Exception occurred during car driving on \n" + ex.getMessage());
        }

    }
}

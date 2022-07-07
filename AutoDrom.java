package example;

import example.cars.Vehicle;

public class AutoDrom {

    public static void goWithMaxSpeed(Vehicle v) {
        int maxSpeed = v.getMaxSpeed();
        int numOfWheels = v.getNumOfWheels();

        System.out.println("Going all my " + maxSpeed + " mph with all my " + numOfWheels +" wheels");
    }
}

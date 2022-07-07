package example;

import example.cars.ElectricCar;
import example.cars.PetrolCar;
import example.cars.Truck;

public class Runner {

    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.setMaxSpeed(250);

        Truck man = new Truck();
        man.setMaxSpeed(120);

        PetrolCar lambo = new PetrolCar();
        lambo.setMaxSpeed(320);

        AutoDrom.goWithMaxSpeed(tesla);
        AutoDrom.goWithMaxSpeed(man);
        AutoDrom.goWithMaxSpeed(lambo);
    }
}

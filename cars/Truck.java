package example.cars;

public class Truck extends Vehicle {
    private int cargoWeight;

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public int getNumOfWheels() {
        return 6;
    }
}

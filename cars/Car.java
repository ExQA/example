package example.cars;

public class Car extends Vehicle {
    int numOfPassengers;

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    @Override
    public int getNumOfWheels() {
        return 4;
    }
}

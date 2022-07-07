package example.cars;

public abstract class Vehicle {
    private int maxSpeed;
    private int weight;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract int getNumOfWheels();

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxPower() {
        return maxSpeed * weight;
    }

    public boolean canGoFasterThen(int limit) {
        return maxSpeed > limit;
    }
}

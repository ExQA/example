package example.cars;

public class ElectricCar extends Car {
    private int milesMaxRange;
    private int milesLeft;

    public int getMilesMaxRange() {
        return milesMaxRange;
    }

    public void setMilesMaxRange(int milesMaxRange) {
        this.milesMaxRange = milesMaxRange;
    }

    public int getMilesLeft() {
        return milesLeft;
    }

    public void charge() {
        System.out.println("Charging to the full ......");
        milesLeft = milesMaxRange;
    }

    public void charge(int miles) {
        System.out.println("Charging adding " + miles + " miles.....");
        int newMiles = milesLeft + miles;
        milesLeft = Math.min(newMiles, milesMaxRange);
    }
}

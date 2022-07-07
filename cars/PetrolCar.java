package example.cars;

public class PetrolCar extends Car {
    private int gasTankVolume;
    private double milesPerGallon;

    public int getGasTankVolume() {
        return gasTankVolume;
    }

    public void setGasTankVolume(int gasTankVolume) {
        this.gasTankVolume = gasTankVolume;
    }

    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }
}

public class MotorBike extends Bike {
    private int enginCC;
    private int tankCapacity;
    private int maxGear;

    public MotorBike(String name, int maxOccupency, int numberOfWheels, String companyName, int numberOfFootrest,
    String bikeType, int enginCC, int tankCapacity, int maxGear) {
            super(name, maxOccupency, numberOfWheels, companyName, numberOfFootrest, bikeType);
            this.enginCC = enginCC;
            this.tankCapacity = tankCapacity;
            this.maxGear = maxGear;
    }

    public int getEnginCC() {
        return this.enginCC;
    }

    public int getTankCapacity() {
        return this.tankCapacity;
    }

    public int getMaxGear() {
        return this.maxGear;
    }
    
}
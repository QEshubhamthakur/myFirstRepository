public class BikeEV extends Bike {
    private int noOfBatteries;
    private int batteryCapacity;

    public BikeEV(String name, int maxOccupency, int numberOfWheels, String companyName, int numberOfFootrest,
    String bikeType, int noOfBatteries, int batteryCapacity) {
        super(name, maxOccupency, numberOfWheels, companyName, numberOfFootrest, bikeType);
        this.noOfBatteries = noOfBatteries;
        this.batteryCapacity = batteryCapacity;
    }

    public int getNoOfBattery(){
        return this.noOfBatteries;
    }

    public int getBatteryCapacity(){
        return this.batteryCapacity;
    }
}

public class CarEV extends Cars {
    private int noOfBatteries;
    private int batteryCapacity;


//always mention super cnstructor before adding local variables.
    public CarEV(String name, int maxOccupency, int numberOfWheel, String companyName, int hasDoors,
            String stearingSide, int noOfBatteries, int batteryCapacity) {
        super(name, maxOccupency, numberOfWheel, companyName, hasDoors, stearingSide);//recall the constructor from parent class(i.e. Cars) using SUPER.
        this.noOfBatteries = noOfBatteries;
        this.batteryCapacity = batteryCapacity;
    }
    //new
    public int getnoOfBatteries() {
        return this.noOfBatteries;
    }

    public int getBatteryCapacity() {
        return this.batteryCapacity;
    }
}
public class Vehicle {
    private String name;
    private int numberOfWheels;
    private int maxOccupency;
    private String companyName;
    private boolean discBrake;

    public Vehicle(String name, int maxOccupency, int numberOfWheels, String companyName) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
        this.maxOccupency = maxOccupency;
        this.companyName = companyName;
    }

    public String getName() {
        return this.name;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public int getNnumberOfWheels() {
        return this.numberOfWheels;
    }

    public int getMaxOccupency() {
        return this.maxOccupency;
    }

    public boolean getDiscBrake() {
        return this.discBrake;
    }

    public void setDiscbrake(boolean discBrake) {
        this.discBrake = discBrake;
    }
}

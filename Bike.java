public class Bike extends Vehicle {
    private int numberOfFootrest;
    private String bikeType;

    public Bike(String name, int maxOccupency, int numberOfWheels, String companyName, int numberOfFootrest,
    String bikeType) {
        super(name, maxOccupency, numberOfWheels, companyName);
        this.numberOfFootrest = numberOfFootrest;
        this.bikeType = bikeType;
    }

    public int getNumberOfFootrest() {
        return this.numberOfFootrest;
    }

    public String getBikeType() {
        return this.bikeType;
    }

}

public class CarICE extends Cars {

    private int enginCC;
    private int tankCapacity;
    private int maxGear;

    public CarICE(String name, int maxOccupency, int numberOfWheel, String companyName, int hasDoors,
            String stearingSide, int enginCC, int tankCapacity, int maxGear) {
        super(name, maxOccupency, numberOfWheel, companyName, hasDoors, stearingSide);
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

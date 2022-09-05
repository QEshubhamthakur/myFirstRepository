public class Cars extends Vehicle {
    private int hasDoors;
    private String stearingSide;
    

    //always mention super cnstructor before adding local variables.
    public Cars(String name, int maxOccupency, int numberOfWheel, String companyName, int hasDoors,
            String stearingSide) { //recall the constructor from parent class(i.e. Vehicle) using SUPER.
        super(name, maxOccupency, numberOfWheel, companyName);
        this.hasDoors = hasDoors;
        this.stearingSide = stearingSide;
    }

    public int getHasDoors() {
        return this.hasDoors;
    }

    public String getStearingSide() {
        return this.stearingSide;
    }

}

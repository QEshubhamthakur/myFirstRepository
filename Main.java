public class Main {
    public static void main(String arg[]) {
        CarEV modelX = new CarEV("Model-X", 4, 4, "Tesla",
                4, "Left", 4, 4500);
        modelX.setDiscbrake(true);
        carev(modelX);

        CarICE sonet = new CarICE("Sonet", 5, 4, "KIYA",
                4, "Right", 1500, 30, 6);
        sonet.setDiscbrake(true);
        carice(sonet);

        BikeEV rv = new BikeEV("RV 400", 2, 2, "REVOLT", 
        4, "Sports", 1, 2000);
        bikeev(rv);

        MotorBike cbr = new MotorBike("CBR 250", 2, 2, "HONDA", 
        4, "Sports", 250, 10, 6);
        cbr.setDiscbrake(true);
        motorbike(cbr);

    }

    public static void carev(CarEV sonet) {
        System.out.print("Model Name: " + sonet.getName()+"  ");
        System.out.print("Brand: " + sonet.getCompanyName()+"  ");
        System.err.println("Number of Doors: " + sonet.getHasDoors());
        System.out.print("Max. Occupancy: " + sonet.getMaxOccupency()+"  ");
        System.out.print("Total Wheels: " + sonet.getNnumberOfWheels()+"  ");
        System.out.println("Total batteries: " + sonet.getnoOfBatteries());
        System.out.print("Stearing side: " + sonet.getStearingSide()+"  ");
        System.out.print("Battery capacity: " + sonet.getBatteryCapacity() + " kWh"+"  ");
        if (sonet.getDiscBrake() == true) {
            System.out.println("Disk Brake: Yes");
        } else {
            System.out.println("Disk Brake: No");
        }
        System.out.println("----------------------------------------------------");
    }

    public static void carice(CarICE sonet) {
        System.out.print("Model Name: " + sonet.getName()+"  ");
        System.out.print("Brand: " + sonet.getCompanyName()+"  ");
        System.err.println("Number of Doors: " + sonet.getHasDoors());
        System.out.print("Max. Occupancy: " + sonet.getMaxOccupency()+"  ");
        System.out.print("Total Wheels: " + sonet.getNnumberOfWheels()+"  ");
        System.out.println("Engine CC: " + sonet.getEnginCC() + "cc");
        System.out.print("Stearing side: " + sonet.getStearingSide()+"  ");
        System.out.print("Tank capacity: " + sonet.getTankCapacity() + " liters"+"  ");
        System.out.print("Max. gear: " + sonet.getMaxGear()+"  ");
        if (sonet.getDiscBrake() == true) {
            System.out.println("Disk Brake: Yes");
        } else {
            System.out.println("Disk Brake: No");
        }
        System.out.println("----------------------------------------------------");
    }

    public static void bikeev(BikeEV sonet) {
        System.out.print("Model Name: " + sonet.getName()+"  ");
        System.out.print("Brand: " + sonet.getCompanyName()+"  ");
        System.err.println("Total Footrest: " + sonet.getNumberOfFootrest());
        System.out.print("Max. Occupancy: " + sonet.getMaxOccupency()+"  ");
        System.out.print("Total Wheels: " + sonet.getNnumberOfWheels()+"  ");
        System.out.println("Total batteries: " + sonet.getNoOfBattery());
        System.out.print("Bike type: " + sonet.getBikeType()+"  ");
        System.out.print("Battery capacity: " + sonet.getBatteryCapacity() + " kWh"+"  ");
        if (sonet.getDiscBrake() == true) {
            System.out.println("Disk Brake: Yes");
        } else {
            System.out.println("Disk Brake: No");
        }
        System.out.println("----------------------------------------------------");
    }

    public static void motorbike(MotorBike sonet) {
        System.out.print("Model Name: " + sonet.getName()+"  ");
        System.out.print("Brand: " + sonet.getCompanyName()+"  ");
        System.err.println("Total Footrest: " + sonet.getNumberOfFootrest());
        System.out.print("Max. Occupancy: " + sonet.getMaxOccupency()+"  ");
        System.out.print("Total Wheels: " + sonet.getNnumberOfWheels()+"  ");
        System.out.println("Engine CC: " + sonet.getEnginCC() + "cc");
        System.out.print("Bike Type: " + sonet.getBikeType()+"  ");
        System.out.print("Tank capacity: " + sonet.getTankCapacity() + " liters"+"  ");
        System.out.print("Max. gear: " + sonet.getMaxGear()+"  ");
        if (sonet.getDiscBrake() == true) {
            System.out.println("Disk Brake: Yes");
        } else {
            System.out.println("Disk Brake: No");
        }
        System.out.println("----------------------------------------------------");
    }

}

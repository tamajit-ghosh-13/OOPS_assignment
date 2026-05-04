package root;

class Automobile {
    String make, type, registrationNumber;
    float maxSpeed, price, mileage;

    void setDetails(String m, String t, float s, float p, float mil, String reg) {
        make = m; type = t; maxSpeed = s; price = p; mileage = mil; registrationNumber = reg;
    }
    void getDetails() { System.out.println(make + " " + type + " Reg: " + registrationNumber); }
}

class Track extends Automobile { // Based on PDF text 'Track'
    int capacity, noOfWheels; String hoodType;
    void setTrack(int cap, int wheels, String hood) { capacity = cap; noOfWheels = wheels; hoodType = hood; }
}

class Car extends Automobile {
    int noOfDoors, seatingCapacity;
    void setCar(int doors, int seat) { noOfDoors = doors; seatingCapacity = seat; }
}

public class ass22 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setDetails("Tesla", "Sedan", 250, 60000, 100, "WB01-1234");
        myCar.setCar(4, 5);
        myCar.getDetails();

        Track myTrack = new Track();
        myTrack.setDetails("Tata", "Heavy", 80, 40000, 10, "WB02-5678");
        System.out.println("Track Hood: " + myTrack.hoodType);
    }
}

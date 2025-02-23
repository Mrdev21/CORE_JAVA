
public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    Car( String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed =150;
        currentFuelInLiters =2;
        noOfSeats = 5;

    }

    Car() {
        color = "Black";
        currentFuelInLiters =5;


    }

    public Car start(){
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel, can't start the car");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is reserved mode, Please refuel");
        } else {
            System.out.println("Car is started, bruhhh....");
        }
        return this;
    }

    public void drive() {
        currentFuelInLiters--;
        System.out.println("Car is driving");

    }

    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}
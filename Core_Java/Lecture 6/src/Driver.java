public class Driver {

    static int minAgeOfDriving = 18;

    String name;

    String dateOfLicence;

    int age;

    public boolean isAllowedToDrive() {
        return this.age >= minAgeOfDriving;
    }

    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());


        Car swift = new Car("Red");
        Car Thar = new Car();
//        swift.addFuel(6);
//        swift.start();
//        swift.drive();
        swift.start().drive();
        System.out.println(swift.color );


//        Driver myDriver = new Driver();
//        myDriver.dateOfLicence = "1/2/34";
//        System.out.println(minAgeOfDriving);
    }
}

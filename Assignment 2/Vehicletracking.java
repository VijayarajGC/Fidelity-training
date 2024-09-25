
class Vehicletracking
{
    protected String registrationNumber;
    protected String brand;


    public Vehicletracking(String registrationNumber, String brand)
    {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }


    public void displayVehicletrackingDetails()
    {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Brand: " + brand);
    }


    public double calculateParkingFee()
    {
        return 0;
    }
}


class Car extends Vehicletracking
{
    private int numDoors;


    public Car(String registrationNumber, String brand, int numDoors)
    {
        super(registrationNumber, brand);
        this.numDoors = numDoors;
    }


    @Override
    public double calculateParkingFee()
    {
        return 20.0; // Flat rate for cars
    }


    @Override
    public void displayVehicletrackingDetails()
    {
        super.displayVehicletrackingDetails();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Parking Fee: $" + calculateParkingFee());
    }
}


class Motorcycle extends Vehicletracking
{
    private String engineType;


    public Motorcycle(String registrationNumber, String brand, String engineType)
    {
        super(registrationNumber, brand);
        this.engineType = engineType;
    }

    @Override
    public double calculateParkingFee()
    {
        return 10.0; // Flat rate for motorcycles
    }



    public void displayVehicleDetails()
    {
        super.displayVehicletrackingDetails();
        System.out.println("Engine Type: " + engineType);
        System.out.println("Parking Fee: $" + calculateParkingFee());
    }
}

 class ParkingLotSystem
 {
    public static void main(String[] args)
    {

        Car car = new Car("ABC123", "Toyota", 4);
        System.out.println("Car Details:");
        car.displayVehicletrackingDetails();

        System.out.println("\n");


        Motorcycle motorcycle = new Motorcycle("XYZ789", "Honda", "2-Stroke");
        System.out.println("Motorcycle Details:");
        motorcycle.displayVehicletrackingDetails();
    }
}

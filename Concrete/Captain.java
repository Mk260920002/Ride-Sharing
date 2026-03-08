package GoodImplementationv1.Concrete;

public class Captain  extends User{
    private Vehicle vehicle;
    public Captain(String name, Location location, Vehicle vehicle)
    {
        super(name, location);
        this.vehicle=vehicle;
    }
    
  

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

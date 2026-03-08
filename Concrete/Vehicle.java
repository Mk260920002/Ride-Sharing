package GoodImplementationv1.Concrete;



public  class Vehicle {
    protected String number_plate;
    protected VehicleType type;
    public Vehicle(String plate,VehicleType type)
    {
        this.number_plate=plate;
        this.type=type;
    }
   
}

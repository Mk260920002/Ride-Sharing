package GoodImplementationv1.Concrete;

public class Passenger  extends User{
    private Location destination;
    public Passenger(String name, Location location , Location destination) 
    {
        super(name, location);
        this.destination=destination;
        
    }
    public Location getDestination() {
        return destination;
    }
    public void setDestination(Location destination) {
        this.destination = destination;
    }
    public double TravelDistance()
    {
        return destination.CalculetDistance(getLocation());
    }
   
   
}

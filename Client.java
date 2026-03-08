package GoodImplementationv1;


import GoodImplementationv1.Concrete.Location;
import GoodImplementationv1.Concrete.LuxuryStrategy;
import GoodImplementationv1.Concrete.Passenger;
import GoodImplementationv1.Concrete.PushNotification;
import GoodImplementationv1.Concrete.RideHandler;

import GoodImplementationv1.Concrete.StandardStrategy;
import GoodImplementationv1.Concrete.AutoRikshaw;
import GoodImplementationv1.Concrete.Bike;
import GoodImplementationv1.Concrete.Captain;
import GoodImplementationv1.Concrete.Car;
import GoodImplementationv1.Concrete.DriverHandler;
import GoodImplementationv1.Concrete.FareService;

public class Client {
    
    public static void main(String [] args)
    {   
        DriverHandler dh = new DriverHandler();
        FareService fs = new FareService();
        
        Captain captain1 = new Captain("Aarav", new Location(12, 45), new Car("BR01-AF1234"));
        Captain captain2 = new Captain("Ishani", new Location(28, 89), new Bike("MH12-RT5678"));
        Captain captain3 = new Captain("Vikram", new Location(5, 14), new Car("DL03-CB9012"));
        Captain captain4 = new Captain("Sanya", new Location(76, 33), new Bike("KA05-NM4321"));
        Captain captain5 = new Captain("Rahul", new Location(42, 10), new AutoRikshaw("UP16-ZZ7788"));
        
        dh.addDriver(captain1);
        dh.addDriver(captain2);
        dh.addDriver(captain3);
        dh.addDriver(captain4);
        dh.addDriver(captain5);

        Passenger pass1 = new Passenger("Kishan", new Location(5, 6), new Location(7, 8));
        Passenger pass2 = new Passenger("Anjali", new Location(12, 22), new Location(15, 30));
        Passenger pass3 = new Passenger("Rohan", new Location(45, 10), new Location(50, 15));
        Passenger pass4 = new Passenger("Sneha", new Location(2, 85), new Location(10, 90));
        Passenger pass5 = new Passenger("Aditya", new Location(33, 33), new Location(40, 45));
        Passenger pass6 = new Passenger("Tanvi", new Location(21, 54), new Location(25, 60));
        Passenger pass7 = new Passenger("Zaid", new Location(8, 19), new Location(14, 2));
        Passenger pass8 = new Passenger("Meghna", new Location(67, 44), new Location(34, 22)); 
                        
        RideHandler rideHandler = new RideHandler(dh,fs,new PushNotification());

        rideHandler.RequestRide(pass1, new StandardStrategy());
        rideHandler.RequestRide(pass2, new StandardStrategy());
        rideHandler.RequestRide(pass3, new StandardStrategy());
        rideHandler.RequestRide(pass4, new StandardStrategy());
        rideHandler.RequestRide(pass5, new StandardStrategy());
        rideHandler.RequestRide(pass6, new StandardStrategy());
        rideHandler.RequestRide(pass7, new StandardStrategy());
        rideHandler.CancelRide(captain5);
        rideHandler.RequestRide(pass8, new LuxuryStrategy());
        rideHandler.CancelRide(captain5);
        rideHandler.RequestRide(pass8, new StandardStrategy());
    }
}

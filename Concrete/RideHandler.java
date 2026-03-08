package GoodImplementationv1.Concrete;

import GoodImplementationv1.Interfaces.FareStrategy;
import GoodImplementationv1.Interfaces.Notification;

public class RideHandler {
    private DriverHandler dh ;
    private FareService fs ;
    private Notification notification;
    public RideHandler(DriverHandler dh, FareService fs , Notification notification)
    {
       this.dh=dh;
       this.fs=fs;
       this.notification=notification;
    }
     
    public void RequestRide(Passenger passenger , FareStrategy strategy)
    {
        
        Captain nearestDriver = dh.findNearestDriver(passenger.getLocation());
        if(nearestDriver==null)
        {
             notification.NotifyPassenger(passenger, "Oops 😩 no driver is availabel near you"); 
            return;
        }
       
        Vehicle driverVehicle = nearestDriver.getVehicle();
        double baseFare = fs.getBaseFare(passenger.TravelDistance(), driverVehicle.type);
        double estimatedFare = strategy.calculateFareWithStrategy(baseFare);
        notification.NotifyPassenger(passenger, "Your captain "+nearestDriver.getName()+" is on the way & your estimated fare is ₹"+estimatedFare);
    }
   
    public void CancelRide(Captain captain)
    {
      if(captain!=null) dh.addDriver(captain);
      
       notification.NotifyCaptain(captain, "Hey captain "+captain.getName()+", your ride is cancelled by passenger 😔");

    }

}

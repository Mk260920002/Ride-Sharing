package GoodImplementationv1.Concrete;

import java.util.ArrayList;

public  class DriverHandler {
    private  final ArrayList<Captain> availavelDrivers= new ArrayList<>();
    
    public  void addDriver(Captain driver)
    {
        availavelDrivers.add(driver);
    }
    public  void removeDriver(Captain driver)
    {
       availavelDrivers.remove(driver);
    }
    
    public Captain findNearestDriver(Location passLocation)
    {
       Location lc1 = passLocation;
       double currentDistance = 1e9;
       Captain nearestDriver =null;
       for(Captain driver:availavelDrivers)
       {
            Location lc2 = driver.getLocation();
            if(lc1.CalculetDistance(lc2)<currentDistance)
            {
                nearestDriver=driver;
                currentDistance=lc1.CalculetDistance(lc2);
            }
       }
       removeDriver(nearestDriver);
       return nearestDriver;
    }
}

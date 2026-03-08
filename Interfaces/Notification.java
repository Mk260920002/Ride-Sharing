package GoodImplementationv1.Interfaces;

import GoodImplementationv1.Concrete.Captain;
import GoodImplementationv1.Concrete.Passenger;

public interface Notification {
    void NotifyPassenger(Passenger pssenger, String Message);
    void NotifyCaptain (Captain captain, String Message);
}

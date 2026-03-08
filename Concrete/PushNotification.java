package GoodImplementationv1.Concrete;

import GoodImplementationv1.Interfaces.Notification;

public class PushNotification implements Notification {

    @Override
    public void NotifyPassenger(Passenger passenger, String Message) {

        System.out.println("Sending Push Notification to passenger : "+passenger.getName()+" "+Message);
    }

    @Override
    public void NotifyCaptain(Captain captain, String Message) {
      System.out.println("Sending Push Notification to captain : "+captain.getName()+" "+Message);
   }
    
}

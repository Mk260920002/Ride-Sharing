package GoodImplementationv1.Concrete;

import GoodImplementationv1.Interfaces.FareStrategy;

public class Car extends Vehicle{

    public Car(String number_plate)
    {
       super(number_plate, VehicleType.CAR);
    }
 
}

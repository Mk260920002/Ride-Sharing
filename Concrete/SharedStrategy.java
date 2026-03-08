package GoodImplementationv1.Concrete;

import GoodImplementationv1.Interfaces.FareStrategy;

public class SharedStrategy implements FareStrategy{

    @Override
    public double calculateFareWithStrategy(double baseFare) {
       
        double fare=0.00;
        double discountPercent =10.00;
        fare = baseFare*((100 - discountPercent)/100.00);
        return fare;

    }
    
}

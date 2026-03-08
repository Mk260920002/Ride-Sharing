package GoodImplementationv1.Concrete;

import GoodImplementationv1.Interfaces.FareStrategy;

public class LuxuryStrategy implements FareStrategy{

    @Override
    public double calculateFareWithStrategy(double baseFare) {
        double fare=0.00;
        double discountPercent =-50;
        fare = baseFare*((100 - discountPercent)/100);
        return fare;
       

    }
    
}

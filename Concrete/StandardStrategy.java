package GoodImplementationv1.Concrete;

import GoodImplementationv1.Interfaces.FareStrategy;

public class StandardStrategy implements FareStrategy{

    @Override
    public double calculateFareWithStrategy( double baseFare) {
        double fare=0.00;
        int discountPercent =0;
        fare = baseFare*((100 - discountPercent)/100);
        return fare;

    }
    
}

package GoodImplementationv1.Concrete;

public class FareService {
    private  final double CAR_RATE=20.00;
    private  final double BIKE_RATE=10.00;
    private  final double AUTO_RATE=5.00;
    private  final double BUS_RATE=2.00;
    public  double getBaseFare(double distance, VehicleType type)
    {
        double ratePerKM=0.00;

        switch (type)
        {
            case BIKE:
                ratePerKM=BIKE_RATE;
                break;
            case CAR:
                ratePerKM=CAR_RATE;
                break;
            case AUTO_RIKSHAW:
                ratePerKM=AUTO_RATE;
                break;
            case BUS:
                ratePerKM=BUS_RATE;
                break;
            default:
                break;

        }
        return distance*ratePerKM;
    }
}

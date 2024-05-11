package Service;

import Model.TripMetaData;

public interface IPricingStrategy {
    public float calculateprice();

    public TripMetaData getTripMetaData();
}
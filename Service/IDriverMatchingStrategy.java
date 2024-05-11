package Service;

import Model.TripMetaData;

public interface IDriverMatchingStrategy {
    public void matchingDriver();
    public TripMetaData getTripMetaData();
}

package Model;

public class TripMetaData {
    private int rider_rating;
    private int driver_rating;
    
    public TripMetaData(int rider_rating, int driver_rating) {
        this.rider_rating = rider_rating;
        this.driver_rating = driver_rating;
    }

    public int getDriver_rating() {
        return driver_rating;
    }

    public void setDriver_rating(int driver_rating) {
        this.driver_rating = driver_rating;
    }

    public int getRider_rating() {
        return rider_rating;
    }

    public void setRider_rating(int rider_rating) {
        this.rider_rating = rider_rating;
    }

}

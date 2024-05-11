package Service;

import java.util.HashMap;
import Model.Rider;

public class RiderService {
    private RiderService riderService;
    private final HashMap<Integer, Rider> riderInfo = new HashMap<>();

    public RiderService getRiderService() {
        if (this.riderService == null) {
            this.riderService = new RiderService();
        }
        return this.riderService;
    }

    public boolean addRider(int riderId, Rider rider) {
        try {
            if (riderInfo.containsKey(riderId)) {
                return false;
            }
            riderInfo.put(riderId, rider);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public Rider getRider(int riderId) {

        if (riderInfo.containsKey(riderId)) {
            return riderInfo.get(riderId);
        }
        // can give some other Excelption.
        throw new NullPointerException();
    }

    public void updateRating(int rating, int riderId) {
        // update DriverLogic
    }

}

package Service;

import java.util.HashMap;

import Model.Trip;
import Model.TripMetaData;

public class TripService {
    private TripService tripService;
    private DriverService driverService;
    private RiderService riderService;
    private StrategyService strategyService;
    private HashMap<Integer , Trip> TripDetails = new HashMap<>();
    private HashMap<Integer , TripMetaData> TripMetalDetails = new HashMap<>();
    
    private TripService(RiderService riderService, DriverService driverService, StrategyService strategyService){
        this.driverService = driverService;
        this.riderService = riderService;
        this.strategyService = strategyService;
    }
    
    public TripService getTripService(RiderService riderService, DriverService driverService, StrategyService strategyService){
        if(this.tripService == null){
            this.tripService = new TripService(riderService, driverService, strategyService);
        }
        return this.tripService;
    }

    public Trip createTrip(/** ... params */) {
        // adding entry
        return null;
    }

    public boolean cancelTrip(int trip_id) {
        // adding entry
        return true;
    }
}

package Service;

import java.util.HashMap;

import Model.Driver;

public class DriverService {
    private DriverService driverService;
    private final HashMap<Integer, Driver> driverInfo = new HashMap<>();

    public DriverService getDriverService() {
        if (this.driverService == null) {
            this.driverService = new DriverService();
        }
        return this.driverService;
    }

    public boolean addDriver(int driverId, Driver driver) {
        try {
            if (driverInfo.containsKey(driverId)) {
                return false;
            }
            driverInfo.put(driverId, driver);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public Driver getDriver(int driverId) {

        if (driverInfo.containsKey(driverId)) {
            return driverInfo.get(driverId);
        }
        // can give some other Excelption.
        throw new NullPointerException();
    }

    public void updateDriver(int availability, boolean isAvailable) {
        //update DriverLogic
    }
}

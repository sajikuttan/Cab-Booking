package Model;

public class Trip {
    private final int id;
    private String src;
    private String dst;
    private Rider rider;
    private Driver driver;
    private float rate;
    private int status;

    private Trip(int id, String src, String dst, Rider rider, Driver driver, float rate, int status) {
        this.id = id;
        this.src = src;
        this.dst = dst;
        this.rider = rider;
        this.driver = driver;
        this.rate = rate;
        this.status = status;
    }

    public Trip addTrip(int id, String src, String dst, Rider rider, Driver driver, float rate, int status) {
        return new Trip(id, src, dst, rider, driver, rate, status);
    }

    public Driver getDriver() {
        return driver;
    }

    public Rider getRider() {
        return rider;
    }

    public String getDst() {
        return dst;
    }

    public String getSrc() {
        return src;
    }

    public int getStatus() {
        return status;
    }

    public float getRate() {
        return rate;
    }

    public int getId() {
        return id;
    }

    public Trip getTripDetails() {
        return this;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
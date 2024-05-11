package Model;

public class Driver {
    private final String name;
    private final String phone;
    private final int id;
    private int rating;
    private String curr_location;
    private boolean availability;

    private Driver(String name, String phone, int id, int rating, String curr_location, boolean availability) {
        this.name = name;
        this.phone = phone;
        this.id = id;
        this.rating = rating;
        this.curr_location = curr_location;
        this.availability = availability;
    }

    public Driver addRider(String name, String phone, int id, int rating, String location, boolean availability) {
        return new Driver(name, phone, id, rating, location, availability);
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public int getRating() {
        return this.rating;
    }

    public void setAvailability(boolean availabity) {
        this.availability = availabity;
    }

    public boolean getAvailability() {
        return this.availability;
    }

    public String getCurrentLocation() {
        return this.curr_location;
    }
}

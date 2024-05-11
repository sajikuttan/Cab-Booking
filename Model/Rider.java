package Model;

public class Rider {
    private final String name;
    private final String phone;
    private final int id;
    private int rating;

    private Rider(String name, String phone, int id, int rating) {
        this.name = name;
        this.phone = phone;
        this.id = id;
        this.rating = rating;
    }

    public Rider addRider(String name, String phone, int id, int rating) {
        return new Rider(name, phone, id, rating);
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
}

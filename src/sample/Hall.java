package sample;

public class Hall {

    private int seats;
    private String name;
    private int id;
    private static int id_tracker = 1;
    private int reservedSeats;
    private int availableSeats;
    private String location;

    public Hall(int seats, String location, String name) {
        this.seats = seats;
        this.availableSeats = seats;
        this.location = location;
        this.name = name;
        this.reservedSeats = 0;
        this.id = id_tracker;
        id_tracker++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }



    @Override
    public String toString() {
        return "Hall{" +
                "seats=" + seats +
                ", availableSeats=" + availableSeats +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}

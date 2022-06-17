public class Booking extends Bedroom {

    private int numberOfNightsBooked;

    public Booking(int roomNumber, RoomType roomType, int numberOfNightsBooked) {
        super(roomNumber, roomType);
        this.numberOfNightsBooked = numberOfNightsBooked;
    }

    public String bookRoom(String booking) {
        return ("Room booked: " + booking);
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;

    @Before
    public void before(){
        this.booking = new Booking(404, RoomType.TRIPLE, 3);
    }

    @Test
    public void canAddNewBooking(){
        Booking booking1 = new Booking(303, RoomType.FAMILY, 4);
        assertEquals("Room booked: 303, FAMILY, 4 nights.", booking.bookRoom(""));
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(404, RoomType.DOUBLE);
    }

    @Test
    public void hasACapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasARoomNumber(){
        assertEquals(404, bedroom.getRoomNumber());
    }

    @Test
    public void hasARoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void guestsStartsEmpty(){
        assertEquals(0, bedroom.getGuests().size());
    }

    @Test
    public void canAddGuest(){
        Guest guest = new Guest("John");
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuest(){
        Guest guest1 = new Guest("John");
        Guest guest2 = new Guest("Stuart");
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.removeGuest(guest1);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

}

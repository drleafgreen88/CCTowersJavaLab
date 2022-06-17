import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(10, "Ducks Room");
    }

    @Test
    public void hasACapacity(){
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void hasAName(){
        assertEquals("Ducks Room", conferenceRoom.getName());
    }

    @Test
    public void guestsStartsEmpty(){
        assertEquals(0, conferenceRoom.getGuests().size());
    }

    @Test
    public void canAddGuest(){
        Guest guest = new Guest("John");
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuest(){
        Guest guest1 = new Guest("John");
        Guest guest2 = new Guest("Stuart");
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.removeGuest(guest1);
        assertEquals(1, conferenceRoom.getNumberOfGuests());
    }

}



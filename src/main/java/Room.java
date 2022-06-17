import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getNumberOfGuests(){
        return guests.size();
    }

    public void addGuest(Guest guest){
        if (this.getNumberOfGuests() < this.capacity){
            this.guests.add(guest);
        }
    }

    public void removeGuest(Guest guest1) {
        this.guests.remove(guest1);
    }
}

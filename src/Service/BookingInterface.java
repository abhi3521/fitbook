package Service;

import Entity.Booking;
import Entity.Slot;
import Entity.User;

import java.util.Date;

public interface BookingInterface {
    public String bookSlots(User user, Slot slot);

}

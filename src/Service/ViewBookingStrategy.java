package Service;

import Entity.Booking;
import Entity.User;

import java.util.Date;
import java.util.List;

public interface ViewBookingStrategy {

    public List<Booking> viewBooking(User user, String date);

}

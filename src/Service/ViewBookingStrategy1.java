package Service;

import Entity.Booking;
import Entity.User;
import Repository.BookingRepo;

import java.util.Date;
import java.util.List;

public class ViewBookingStrategy1 implements ViewBookingStrategy{
    BookingRepo bookingRepo;

    public ViewBookingStrategy1(BookingRepo bookingRepo) {
        this.bookingRepo = bookingRepo;
    }
    @Override
    public List<Booking> viewBooking(User user, String date) {
        return bookingRepo.getBookingsByDateAndUser(date, user.getId());
    }

   /* @Override
    public List<Booking> viewBooking(User user, String date) {
        System.out.println("🔍 Fetching bookings for user: " + user.getName() + " on " + date);

        List<Booking> allBookings = bookingRepo.getAllBookings();

        System.out.println("📌 All bookings before filtering: " + allBookings);

        List<Booking> filteredBookings = allBookings.stream()
                .filter(b -> b.getUser().equals(user) && b.getSlot().getDate().equals(date))
                .toList();

        System.out.println("✅ Filtered bookings: " + filteredBookings);
        return filteredBookings;
    }*/
}

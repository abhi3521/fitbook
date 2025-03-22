package Repository;

import Entity.Booking;
import Entity.Slot;
import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;
@Getter
public class BookingRepo {
    private Map<Long, Booking>  bookingMap = new HashMap<>();
    private long bookingIdCounter = 0;

    public void save(Booking booking) {
        booking.setId(bookingIdCounter++);
        bookingMap.putIfAbsent(booking.getId(), booking);
        System.out.println("✅ Booking added to repo: " + booking);
    }

    public List<Booking> getBookingsByDateAndUser(String date, long userId) {
        return bookingMap.values()
                .stream()
                .filter(b -> b.getSlot().getDate().equals(date) && b.getUser().getId() == userId)
                .collect(Collectors.toList());

    }

    public List<Booking> getAllBookings() {
        List<Booking> bookings = new ArrayList<>(bookingMap.values());
        System.out.println("📌 All Bookings in Repo: " + bookings);  // Debug print
        return bookings;
    }
}

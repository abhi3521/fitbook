package Service;

import Entity.Booking;
import Entity.Slot;
import Entity.User;
import Repository.BookingRepo;
import Repository.SlotRepo;

import java.util.Date;

public class BookingService implements BookingInterface{
    BookingRepo bookingRepo;
    SlotRepo slotRepo;

    public BookingService(BookingRepo bookingRepo, SlotRepo slotRepo) {
        this.bookingRepo = bookingRepo;
        this.slotRepo = slotRepo;
    }

    @Override
    public String bookSlots(User user, Slot slot) {
        if(slot.getSeats() == 0) {
            return "No Seats available.";
        }

        Booking booking = new Booking();
        booking.setUser(user);
        booking.setSlot(slot);
        bookingRepo.save(booking);

        System.out.println("✅ Booking saved: " + booking);

        Slot remainingSlot = slot;
        remainingSlot.setSeats(slot.getSeats()-1);
        slotRepo.saveSlot(remainingSlot);
        return "Booking Successful!";
    }


}

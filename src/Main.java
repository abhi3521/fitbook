import Entity.Booking;
import Entity.Centre;
import Entity.Slot;
import Entity.User;
import Repository.BookingRepo;
import Repository.SlotRepo;
import Service.AdminService;
import Enum.WorkoutType;
import Service.BookingService;
import Service.ViewBookingStrategy;
import Service.ViewBookingStrategy1;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        Centre centre = new Centre(1, "Bellandur", "Bellandur");
        Slot slot1 = new Slot(1, centre, "21/03/2025", "10:00", "11:00", WorkoutType.Yoga, 10);

        User user1 = new User(1, "user1", "user1@gmail.com", "HSR");

        SlotRepo slotRepo = new SlotRepo();  // ✅ Create SlotRepo instance
        BookingRepo bookingRepo = new BookingRepo();
        AdminService adminService = new AdminService(slotRepo);
        adminService.addSlot(slot1);

        BookingService bookingService = new BookingService(bookingRepo, slotRepo);
        bookingService.bookSlots(user1, slot1);

        ViewBookingStrategy viewBookingStrategy = new ViewBookingStrategy1(bookingRepo);
        List<Booking> bookings = viewBookingStrategy.viewBooking(user1, "21/03/2025");

        System.out.println("\nAll Bookings:");
        for (Booking booking : bookings) {
            System.out.println(booking);
        }

    }
}
package taspoc.bookingdemo;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookingController {
    private List<HotelBooking> bookings;

    public BookingController() {
        bookings = new ArrayList<>();

    }
}

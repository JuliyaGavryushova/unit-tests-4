package seminars.fourth.hotel;


import org.junit.jupiter.api.Test;
import seminars.fourth.book.BookService;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookingServiceTest {
    @Test
    void bookingServiceTest() {
        HotelService hotelService = mock(HotelService.class);
        BookingService bookingService = new BookingService(hotelService);

        when(hotelService.isRoomAvailable(3)).thenReturn(false);

        Boolean result = bookingService.bookRoom(3);

        assertFalse(result);
    }
}
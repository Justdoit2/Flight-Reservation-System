import org.junit.Test;
import static org.junit.Assert.*;

public class AircraftTest {
    @Test
    public void testAddSeat() {
        Aircraft aircraft = new Aircraft("123", "ECON", 2);
        Seat seat1 = new Seat(SeatStatus.AVAILABLE, "1", SeatType.REGULAR);
        Seat seat2 = new Seat(SeatStatus.BOOKED, "2", SeatType.EMERGENCY_EXIT);
        Seat seat3 = new Seat(SeatStatus.BOOKED, "3", SeatType.EMERGENCY_EXIT);

        try {
            aircraft.addSeat(seat1);
            aircraft.addSeat(seat2);
            // This should throw an exception because the aircraft's seat capacity is 2
            aircraft.addSeat(seat3);
            fail("Expected an Exception to be thrown");
        } catch (Exception e) {
            assertTrue(e instanceof Exception);
            assertEquals("Seat capacity exceeded", e.getMessage());
        }
    }
}
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;
import java.util.HashMap;

public class FlightReservationTest {
    @Test
    public void testFlightReservation() {
        Passenger p = new Passenger("Jane",1,002);
        Seat s = new Seat(SeatStatus.AVAILABLE, "1", SeatType.REGULAR);
        HashMap<Passenger, Seat> seatMap = new HashMap<>();
        seatMap.put(p, s);
        FlightReservation flightReservation = new FlightReservation("000", seatMap, ReservationStatus.CHECKED_IN, new Date());

        // Test getters and setters
        assertEquals("000", flightReservation.getReservationNumber());

        // Test addPassenger
        Passenger p2 = new Passenger("Joe",2,003);
        Seat s2 = new Seat(SeatStatus.BOOKED, "2", SeatType.EMERGENCY_EXIT);
        flightReservation.addPassenger(p2, s2);

        // Test createFlight
        Aircraft air = new Aircraft("123","ECON",2);
        Flight flight = new Flight("5730",air,new Date(),"NYC","LA");
        flightReservation.createFlight(flight);
        assertEquals(flight, flightReservation.findFlight("5730"));

        // Test addCrewMember
        CrewMember crew = new CrewMember("John", "001");
        flightReservation.addCrewMember(crew, "5730");
        
        // Test findFlight
        Flight foundFlight = flightReservation.findFlight("5730");
        assertEquals(flight, foundFlight);

        foundFlight = flightReservation.findFlight("5730");
        assertEquals(flight.getFlightNumber(), foundFlight.getFlightNumber());

        foundFlight = flightReservation.findFlight("nonexistent flight number");
        assertNull(foundFlight);
        // Test deleteFlight
        flightReservation.deleteFlight("5730");
        assertNull(flightReservation.findFlight("5730"));
    }
}

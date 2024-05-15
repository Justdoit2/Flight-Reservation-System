import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class FlightTest {
    @Test
    public void testFlight() {
        Aircraft aircraft = new Aircraft("123", "ECON", 2);
        CrewMember crew = new CrewMember("John", "001");
        Flight flight = new Flight("5730", aircraft, new Date(), "NYC", "LA");

        // Test getters
        assertEquals("5730", flight.getFlightNumber());
        assertEquals(aircraft, flight.getAircraft());
        assertEquals("NYC", flight.getOrigin());
        assertEquals("LA", flight.getDestination());

        // Test setters
        flight.setFlightNumber("5731");
        assertEquals("5731", flight.getFlightNumber());

        Aircraft newAircraft = new Aircraft("456", "BUS", 3);
        flight.setAircraft(newAircraft);
        assertEquals(newAircraft, flight.getAircraft());

        flight.setOrigin("TX");
        assertEquals("TX", flight.getOrigin());

        flight.setDestination("WYM");
        assertEquals("WYM", flight.getDestination());
    }
}
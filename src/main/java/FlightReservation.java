import java.util.*;

enum ReservationStatus {
  REQUESTED,
  PENDING,
  CONFIRMED,
  CHECKED_IN,
  CANCELED
}

public class FlightReservation {
  private String reservationNumber;
  private HashMap<Passenger, Seat> seatMap;
  private ReservationStatus status;
  private Date creationDate;
  private List<Flight> flights;

  public FlightReservation(String reservationNumber, HashMap<Passenger, Seat> seatMap, ReservationStatus status, Date creationDate){
    this.reservationNumber = reservationNumber;
    this.seatMap = seatMap;
    this.status = status;
    this.creationDate = creationDate;
    this.flights=new ArrayList<Flight>();
  }

  public static FlightReservation fetchReservationDetails(String reservationNumber){
    return null; //database operation fetch later
  }
  
  public List<Passenger> getPassengers(){
    return new ArrayList<Passenger>(seatMap.keySet());
  }

  public String getReservationNumber(){
    return this.reservationNumber;
  }

  public void createFlight(Flight f){
      this.flights.add(f);
  }

  public void addPassenger(Passenger p, Seat s){
    if (!seatMap.containsKey(p)) {
      seatMap.put(p, s);
    } else {
      System.out.println("Passenger already has a seat assigned.");
    }
  }

  public Flight findFlight(String flightNumber ){
    for (Flight f : this.flights) {
        if (f.getFlightNumber().equals(flightNumber)){
          return f;
        }
      }
      return null;  // return null if no flight is found  
  }

  public void deleteFlight(String flightNumber) {
      this.flights.removeIf(flight -> flight.getFlightNumber().equals(flightNumber));
  }

  public Passenger findPassenger(int passengerId ){
    for (Passenger p : this.getPassengers()) {
      if (p.getPassengerId()== passengerId) {
        return p;
      }
    }
    return null;  // return null if flight found  
  }

  public void addCrewMember(CrewMember crew, String flightNumber){
    int flightIndex = -1;
    for (int i = 0; i < this.flights.size(); i++) {
      if (this.flights.get(i).getFlightNumber().equals(flightNumber)) {
        flightIndex = i;
        break;
      }
    }

    if (flightIndex != -1) {
      Flight f = this.flights.get(flightIndex);
      f.addCrewMember(crew);
      this.flights.set(flightIndex, f);  // update the flight in the list
    }
  }
}


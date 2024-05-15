import java.util.Date;

public class Flight{
  private String flightNumber;
  private Aircraft aircraft;
  private Date departureTime;
  private String origin;
  private String destination;
  private CrewMember crew;

  public Flight(String flightNumber, Aircraft aircraft, Date departureTime, String origin, String destination){
    this.flightNumber=flightNumber;
    this.aircraft=aircraft;
    this.departureTime=departureTime;
    this.origin=origin;
    this.destination=destination;
  }

   // Getter and Setter methods
    public String getFlightNumber() {
      return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
      this.flightNumber = flightNumber;
    }

    public Aircraft getAircraft() {
      return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
      this.aircraft = aircraft;
    }

    public Date getDepartureTime() {
      return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
      this.departureTime = departureTime;
    }

    public String getOrigin() {
      return origin;
    }

    public void setOrigin(String origin) {
      this.origin = origin;
    }

    public String getDestination() {
      return destination;
    }

    public void setDestination(String destination) {
      this.destination = destination;
    }

    public void addCrewMember(CrewMember crew){
      this.crew=crew;
      System.out.println(this.crew.name);
    }
}
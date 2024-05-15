enum SeatStatus {
  AVAILABLE,
  BOOKED,
  CHANCE
}

enum SeatType {
  REGULAR,
  ACCESSIBLE,
  EMERGENCY_EXIT,
  EXTRA_LEG_ROOM
}

public class Seat {
  private double fare;
  private SeatStatus status;
  private String reservationNumber;
  private SeatType type;
  //public static seatNumber=1;

  public Seat(SeatStatus status, String reservationNumber, SeatType type) {
    this.status=status;
    this.reservationNumber=reservationNumber;
    this.type=type;
    this.fare=12.00;
      
  }

  public void setStatus(SeatStatus status){
    this.status=status;
  }
  public SeatStatus getStatus(){
    return this.status;
  }

  public void setReservationNumber( String reservationNumber){
    this.reservationNumber=reservationNumber;
  }

  public String getReservationNumber(){
    return this.reservationNumber;
  }

  public SeatType getSeatType(){
    return this.type;
  }

  public void  setFare(double n){
    this.fare=n;
  }

  public double getFare(){
    return this.fare;
  }  
}

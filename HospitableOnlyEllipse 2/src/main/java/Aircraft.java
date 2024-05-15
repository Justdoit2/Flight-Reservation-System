import java.util.*;

public class Aircraft{
  private String registrationNumber;
  private String model;
  private int seatCapacity;
  private List<Seat> seats;

  public Aircraft(String registrationNumber, String model, int seatCapacity){
    this.registrationNumber=registrationNumber;
    this.model=model;
    this.seatCapacity=seatCapacity;
    this.seats= new ArrayList<Seat>();
   
  }

  public String getModel(){
    return this.model;
  }

  public String getRegistrationNumber(){
    return this.registrationNumber;
  }

  public void setSeatCapacity(int capacity){
    this.seatCapacity=capacity;
    
  }

  public int getSeatCapacity(){
    return this.seatCapacity;
  }

  public void addSeat(Seat seat) throws Exception{
    if (this.seats.size()<this.seatCapacity){
      this.seats.add(seat);
    }
    else {
        throw new Exception("Seat capacity exceeded");
    }
  }

  public Seat findSeat(String seatNumber) {
    for (Seat seat : this.seats) {
      if (seat.getReservationNumber() == seatNumber) {
        return seat;
      }
    }
    return null;  // return null if no seat is found
  }

  public void deleteSeat(String seatNumber) {
    Seat seatToDelete = findSeat(seatNumber);
    if (seatToDelete != null) {
      System.out.println(seatToDelete.getReservationNumber() + "deleted");
      this.seats.remove(seatToDelete);
    }
  }  
}

public class Passenger extends Person{
  private int passengerId;
  private String name;
  private int seatNumber;
 
  public Passenger(String name, int passId, int seatNumber){
    this.name=name;
    this.passengerId=passId;
    this.seatNumber=seatNumber;    
  }

  public void setSeatNumber(int num){
    this.seatNumber=num;
  }

  public int getSeatNumber(){
    return this.seatNumber;
  }

  public void setName(String name){
    this.name =name;
  }

  public String getName(){
    return this.name;
  }

  public int getPassengerId(){
    return this.passengerId;
  }
}

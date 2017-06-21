package example.codeclan.com.composition_starter;

import behaviours.Flyable;
import behaviours.Protectable;

public class Wizard {
  String name;
  Broomstick broomstick;
  private Flyable ride;
  private Protectable backUp;

  public Wizard(String name, Flyable ride, Protectable backUp){
    this.name = name;
    this.ride = ride;
    this.backUp = backUp;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public Protectable getBackUp(){
    return this.backUp;
  }

  public String fly(){
    return this.ride.fly();
  }

  public String protect(){
    return this.backUp.protect();
  }

  public void setRide(Flyable ride) {
    this.ride = ride;
  }

  public void setBackUp(Protectable backUp) {
    this.backUp = backUp;
  }
}
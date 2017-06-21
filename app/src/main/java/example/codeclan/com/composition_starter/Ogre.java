package example.codeclan.com.composition_starter;

import behaviours.Protectable;

public class Ogre extends MythicalBeast implements Protectable {
  
  public Ogre(String name){
    super(name);
  }

  public String protect() {
    return "Hawners";
  }

}
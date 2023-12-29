package model.data;

import java.util.Calendar;

public class Hamster extends Pet {

  public Hamster(String name, Calendar birthday, String commands) {
    super(name, birthday, commands);
  }

  @Override
  public String toString() {
    return "Хомяк " + super.toString();
  }

}

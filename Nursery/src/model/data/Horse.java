package model.data;

import java.util.Calendar;

public class Horse extends PackAnimal {

  public Horse(String name, Calendar birthday, String commands) {
    super(name, birthday, commands);
  }

  @Override
  public String toString() {
    return "Лошадь " + super.toString();
  }

}

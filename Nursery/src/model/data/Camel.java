package model.data;

import java.util.Calendar;

public class Camel extends PackAnimal {

  public Camel(String name, Calendar birthday, String commands) {
    super(name, birthday, commands);
  }

  @Override
  public String toString() {
    return "Верблюд " + super.toString();
  }

}

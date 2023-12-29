package Animal;

import java.util.Calendar;

public class Dog extends Pet {

  public Dog(String name, Calendar birthday, String commands) {
    super(name, birthday, commands);
  }

  @Override
  public String toString() {
    return "Собака " + super.toString();
  }

}

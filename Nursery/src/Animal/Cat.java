package Animal;

import java.util.Calendar;

public class Cat extends Pet {

  public Cat(String name, Calendar birthday, String commands) {
    super(name, birthday, commands);
  }

  @Override
  public String toString() {
    return "Кошка " + super.toString();
  }

}

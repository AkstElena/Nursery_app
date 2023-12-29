package Animal;

import java.util.Calendar;

public class Donkey extends PackAnimal {

  public Donkey(String name, Calendar birthday, String commands) {
    super(name, birthday, commands);
  }

  @Override
  public String toString() {
    return "Осел " + super.toString();
  }

}

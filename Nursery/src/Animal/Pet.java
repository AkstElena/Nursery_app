package Animal;

import java.util.Calendar;

public abstract class Pet extends HumanFriend {

  public Pet(String name, Calendar birthday, String commands) {
    super(name, birthday, commands);
  }

  @Override
  public String toString() {
    return "(Домашнее животное)" + super.toString();
  }

}

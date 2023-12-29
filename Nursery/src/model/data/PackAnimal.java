package model.data;

import java.util.Calendar;

public abstract class PackAnimal extends HumanFriend {

  public PackAnimal(String name, Calendar birthday, String commands) {
    super(name, birthday, commands);
  }

  @Override
  public String toString() {
    return "(Вьючное животное)" + super.toString();
  }

}

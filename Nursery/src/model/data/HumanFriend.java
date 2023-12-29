package model.data;

import java.util.Calendar;

public abstract class HumanFriend {

  private String name;
  private Calendar birthday;
  private String commands;

  public HumanFriend(String name, Calendar birthday, String commands) {
    this.name = name;
    this.birthday = birthday;
    this.commands = commands;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Calendar getBirthday() {
    return birthday;
  }

  public void setBirthday(Calendar birthday) {
    this.birthday = birthday;
  }

  public String getCommands() {
    return commands;
  }

  public void setCommands(String commands) {
    this.commands = commands;
  }

  @Override
  public String toString() {
    return ": кличка = " + name + "; день рождениe = " + birthday.get(Calendar.YEAR) + "-"
        + birthday.get(Calendar.MONTH)
        + "-" + birthday.get(Calendar.DAY_OF_MONTH) + "; выполняемые команды = " + commands;
  }
}

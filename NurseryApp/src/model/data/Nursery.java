package model.data;

import java.util.ArrayList;

public class Nursery {

  private ArrayList<HumanFriend> db;

  public Nursery(ArrayList<HumanFriend> db) {
    this.db = db;
  }

  public Nursery() {
    this.db = new ArrayList<>();
  }

  public ArrayList<HumanFriend> getListHumanFriend() {
    return db;
  }

  public void setListHumanFriend(ArrayList<HumanFriend> db) {
    this.db = db;
  }

  public void addHumanFriends(HumanFriend humanFriend) {
    db.add(humanFriend);
  }

  public String getCommands(String name) {
    for (HumanFriend el : db) {
      if (el.getName().equals(name)) {
        return el.getCommands();
      }
    }
    return "Такого животного в питомнике нет";
  }

  public void setCommands(String name, String commands) {
    boolean flag = true;
    for (int i = 0; i < db.size(); i++) {
      if (db.get(i).getName().equals(name)) {
        String result = db.get(i).getCommands();
        result += ", " + commands;
        db.get(i).setCommands(result);
        System.out.print("Новая команда добавлена\n");
        flag = false;
      }
    }
    if (flag) {
      System.out.println("Такого животного в питомнике нет\n");
    }
  }

  @Override
  public String toString() {
    String result = "Животные в питомнике:\n";
    for (int i = 0; i < db.size(); i++) {
      result += db.get(i) + "\n";
    }
    return result;
  }

}

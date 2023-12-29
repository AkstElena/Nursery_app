package model.data;

import java.util.ArrayList;

public class Nursery {

  ArrayList<HumanFriend> db;

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

  @Override
  public String toString() {
    String result = "Животные в питомнике:\n";
    for (int i = 0; i < db.size(); i++) {
      result += db.get(i) + "\n";
    }
    return result;
  }

}

import java.util.ArrayList;
import java.util.List;

import Animal.HumanFriend;

public class Nursery {

  List<HumanFriend> listHumanFriend = new ArrayList<>();

  public Nursery(List<HumanFriend> listHumanFriend) {
    this.listHumanFriend = listHumanFriend;
  }

  public List<HumanFriend> getListHumanFriend() {
    return listHumanFriend;
  }

  public void setListHumanFriend(List<HumanFriend> listHumanFriend) {
    this.listHumanFriend = listHumanFriend;
  }

  // public void addHumanFriends(String name, Calendar birthday, String commands)
  // {

  // }

  @Override
  public String toString() {
    String result = "Животные в питомнике:\n";
    for (int i = 0; i < listHumanFriend.size(); i++) {
      result += listHumanFriend.get(i) + "\n";
    }
    return result;
  }

}

package Controller;

import java.util.ArrayList;
import java.util.Calendar;

import model.data.Cat;
import model.data.HumanFriend;
import model.service.DataService;
import model.service.UserService;

public class Controller {
  private DataService service = new UserService();

  public Cat createNewCat(String name, Calendar birthday, String commands) {
    return service.createCat(name, birthday, commands);
  }

  public ArrayList<HumanFriend> showHumanFriends() {
    return service.getHumanFriendList();
  }

}

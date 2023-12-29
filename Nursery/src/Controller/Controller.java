package Controller;

import java.util.Calendar;

import model.data.Camel;
import model.data.Cat;
import model.data.Dog;
import model.data.Donkey;
import model.data.Hamster;
import model.data.Horse;
import model.service.DataService;
import model.service.UserService;

public class Controller {
  private DataService service = new UserService();

  public Dog createNewDog(String name, Calendar birthday, String commands) {
    return service.createDog(name, birthday, commands);
  }

  public Cat createNewCat(String name, Calendar birthday, String commands) {
    return service.createCat(name, birthday, commands);
  }

  public Hamster createNewHamser(String name, Calendar birthday, String commands) {
    return service.createHamster(name, birthday, commands);
  }

  public Horse createNewHorse(String name, Calendar birthday, String commands) {
    return service.createHorse(name, birthday, commands);
  }

  public Camel createNewCamel(String name, Calendar birthday, String commands) {
    return service.createCamel(name, birthday, commands);
  }

  public Donkey createNewDonkey(String name, Calendar birthday, String commands) {
    return service.createDonkey(name, birthday, commands);
  }

  public String showHumanFriends() {
    return service.getHumanFriendList();
  }

  public String showCommands(String name) {
    return service.getCommands(name);
  }

  public void setCommands(String name, String commands) {
    service.setCommands(name, commands);
  }

}

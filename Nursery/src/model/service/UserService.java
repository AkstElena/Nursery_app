package model.service;

import java.util.ArrayList;
import java.util.Calendar;

import model.data.Camel;
import model.data.Cat;
import model.data.Dog;
import model.data.Donkey;
import model.data.Hamster;
import model.data.Horse;
import model.data.HumanFriend;
import model.data.Nursery;

public class UserService implements DataService {
  private static final Nursery db = new Nursery();

  @Override
  public Camel createCamel(String name, Calendar birthday, String commands) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Cat createCat(String name, Calendar birthday, String commands) {
    Cat cat = new Cat(name, birthday, commands);
    db.addHumanFriends(cat);
    return cat;
  }

  @Override
  public Dog createDog(String name, Calendar birthday, String commands) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Donkey createDonkey(String name, Calendar birthday, String commands) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Hamster createHamster(String name, Calendar birthday, String commands) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Horse createHorse(String name, Calendar birthday, String commands) {
    // TODO Auto-generated method stub
    return null;
  }

  public ArrayList<HumanFriend> getHumanFriendList() {
    ArrayList<HumanFriend> usrList = db.getListHumanFriend();
    return usrList;
  }

}

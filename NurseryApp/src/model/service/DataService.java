package model.service;

import java.util.Calendar;

import model.data.Camel;
import model.data.Cat;
import model.data.Dog;
import model.data.Donkey;
import model.data.Hamster;
import model.data.Horse;

public interface DataService {

  Dog createDog(String name, Calendar birthday, String commands);

  Cat createCat(String name, Calendar birthday, String commands);

  Hamster createHamster(String name, Calendar birthday, String commands);

  Horse createHorse(String name, Calendar birthday, String commands);

  Camel createCamel(String name, Calendar birthday, String commands);

  Donkey createDonkey(String name, Calendar birthday, String commands);

  String getHumanFriendList();

  String getCommands(String name);

  void setCommands(String name, String commands);
}

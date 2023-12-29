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

public interface DataService {

  Dog createDog(String name, Calendar birthday, String commands);

  Cat createCat(String name, Calendar birthday, String commands);

  Hamster createHamster(String name, Calendar birthday, String commands);

  Horse createHorse(String name, Calendar birthday, String commands);

  Camel createCamel(String name, Calendar birthday, String commands);

  Donkey createDonkey(String name, Calendar birthday, String commands);

  ArrayList<HumanFriend> getHumanFriendList();
}

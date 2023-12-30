package model.service;

import java.util.Calendar;

import model.data.Camel;
import model.data.Cat;
import model.data.Dog;
import model.data.Donkey;
import model.data.Hamster;
import model.data.Horse;
import model.data.Nursery;

public class UserService implements DataService {
  private static final Nursery db = new Nursery();

  @Override
  public Camel createCamel(String name, Calendar birthday, String commands) {
    Camel camel = new Camel(name, birthday, commands);
    db.addHumanFriends(camel);
    return camel;
  }

  @Override
  public Cat createCat(String name, Calendar birthday, String commands) {
    Cat cat = new Cat(name, birthday, commands);
    db.addHumanFriends(cat);
    return cat;
  }

  @Override
  public Dog createDog(String name, Calendar birthday, String commands) {
    Dog dog = new Dog(name, birthday, commands);
    db.addHumanFriends(dog);
    return dog;
  }

  @Override
  public Donkey createDonkey(String name, Calendar birthday, String commands) {
    Donkey donkey = new Donkey(name, birthday, commands);
    db.addHumanFriends(donkey);
    return donkey;
  }

  @Override
  public Hamster createHamster(String name, Calendar birthday, String commands) {
    Hamster hamster = new Hamster(name, birthday, commands);
    db.addHumanFriends(hamster);
    return hamster;
  }

  @Override
  public Horse createHorse(String name, Calendar birthday, String commands) {
    Horse horse = new Horse(name, birthday, commands);
    db.addHumanFriends(horse);
    return horse;
  }

  @Override
  public String getHumanFriendList() {
    return db.toString();
  }

  @Override
  public String getCommands(String name) {
    return db.getCommands(name);
  }

  @Override
  public void setCommands(String name, String commands) {
    db.setCommands(name, commands);

  }

}

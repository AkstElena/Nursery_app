package View;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import Controller.Controller;
import model.data.Camel;
import model.data.Cat;
import model.data.Dog;
import model.data.Donkey;
import model.data.Hamster;
import model.data.Horse;

public class UserView {
  private Scanner in = new Scanner(System.in);
  private Controller contr = new Controller();

  public void startInterface() {
    while (true) {
      System.out.println(
          "Выберите действие:\n1) Показать всех животных в питомнике\n2) Добавить животное\n3) Показать команды животного\n4) Научить животное новой команде\n5) Выход");
      int choise = in.nextInt();
      in.nextLine();
      switch (choise) {
        case 1:
          System.out.print("\033[H\033[J");
          System.out.println(contr.showHumanFriends());
          break;
        case 2:
          chooseAnimal();
          break;
        case 3:
          showCommands();
          break;
        case 4:
          addCommands();
          break;
        case 5:
          System.out.print("\033[H\033[J");
          System.out.println("До свидание, спасибо за использование приложения");
          return;
        default:
          System.out.print("\033[H\033[J");
          System.out.println("Введен некорректный пункт меню!");
          return;

      }
    }
  }

  public void chooseAnimal() {
    System.out.print("\033[H\033[J");
    while (true) {
      System.out.println(
          "Выберите действие:\n1) Добавить собаку\n2) Добавить кота\n3) Добавить хомяка\n4) Добавить лошадь\n5) Добавить верблюда\n6) Добавить осла\n7) Возврат в основное меню\n");
      int choiseAnimal = in.nextInt();
      in.nextLine();
      switch (choiseAnimal) {
        case 1:
          System.out.println(createDog().toString());
          break;
        case 2:
          System.out.println(createCat().toString());
          break;
        case 3:
          System.out.println(createHamster().toString());
          break;
        case 4:
          System.out.println(createHorse().toString());
          break;
        case 5:
          System.out.println(createCamel().toString());
          break;
        case 6:
          System.out.println(createDonkey().toString());
          break;
        case 7:
          System.out.print("\033[H\033[J");
          return;
        default:
          System.out.print("\033[H\033[J");
          System.out.println("Введен некорректный пункт меню!");
          return;
      }
    }
  }

  public void showCommands() {
    System.out.print("\033[H\033[J");
    System.out.print("Введите имя животного, команды которого необходимо увидеть: ");
    String name = in.nextLine();
    System.out.println(contr.showCommands(name));
  }

  public void addCommands() {
    System.out.print("\033[H\033[J");
    System.out.print("Введите имя животного, которого необходимо научить научить новой команде: ");
    String name = in.nextLine();
    System.out.print("Ввведите новую команду: ");
    String commands = in.nextLine();
    contr.setCommands(name, commands);
    System.out.print("Новая команда добавлена");

  }

  public Dog createDog() {
    System.out.print("\033[H\033[J");
    System.out.print("Введите имя: ");
    String name = in.nextLine();
    System.out.print("Введите команды через запятую в одну строку : ");
    String commands = in.nextLine();
    System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
    String[] tempDate = in.nextLine().split("\\.");
    Calendar birthday = new GregorianCalendar(Integer.parseInt(tempDate[2]), Integer.parseInt(tempDate[1]),
        Integer.parseInt(tempDate[0]));
    return contr.createNewDog(name, birthday, commands);
  }

  public Cat createCat() {
    System.out.print("\033[H\033[J");
    System.out.print("Введите имя: ");
    String name = in.nextLine();
    System.out.print("Введите команды через запятую в одну строку : ");
    String commands = in.nextLine();
    System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
    String[] tempDate = in.nextLine().split("\\.");
    Calendar birthday = new GregorianCalendar(Integer.parseInt(tempDate[2]), Integer.parseInt(tempDate[1]),
        Integer.parseInt(tempDate[0]));
    return contr.createNewCat(name, birthday, commands);
  }

  public Hamster createHamster() {
    System.out.print("\033[H\033[J");
    System.out.print("Введите имя: ");
    String name = in.nextLine();
    System.out.print("Введите команды через запятую в одну строку : ");
    String commands = in.nextLine();
    System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
    String[] tempDate = in.nextLine().split("\\.");
    Calendar birthday = new GregorianCalendar(Integer.parseInt(tempDate[2]), Integer.parseInt(tempDate[1]),
        Integer.parseInt(tempDate[0]));
    return contr.createNewHamser(name, birthday, commands);
  }

  public Horse createHorse() {
    System.out.print("\033[H\033[J");
    System.out.print("Введите имя: ");
    String name = in.nextLine();
    System.out.print("Введите команды через запятую в одну строку : ");
    String commands = in.nextLine();
    System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
    String[] tempDate = in.nextLine().split("\\.");
    Calendar birthday = new GregorianCalendar(Integer.parseInt(tempDate[2]), Integer.parseInt(tempDate[1]),
        Integer.parseInt(tempDate[0]));
    return contr.createNewHorse(name, birthday, commands);
  }

  public Camel createCamel() {
    System.out.print("\033[H\033[J");
    System.out.print("Введите имя: ");
    String name = in.nextLine();
    System.out.print("Введите команды через запятую в одну строку : ");
    String commands = in.nextLine();
    System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
    String[] tempDate = in.nextLine().split("\\.");
    Calendar birthday = new GregorianCalendar(Integer.parseInt(tempDate[2]), Integer.parseInt(tempDate[1]),
        Integer.parseInt(tempDate[0]));
    return contr.createNewCamel(name, birthday, commands);
  }

  public Donkey createDonkey() {
    System.out.print("\033[H\033[J");
    System.out.print("Введите имя: ");
    String name = in.nextLine();
    System.out.print("Введите команды через запятую в одну строку : ");
    String commands = in.nextLine();
    System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
    String[] tempDate = in.nextLine().split("\\.");
    Calendar birthday = new GregorianCalendar(Integer.parseInt(tempDate[2]), Integer.parseInt(tempDate[1]),
        Integer.parseInt(tempDate[0]));
    return contr.createNewDonkey(name, birthday, commands);
  }

}

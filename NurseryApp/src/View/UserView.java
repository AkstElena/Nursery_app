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
      System.out.print("\033[H\033[J");
      System.out.println(
          "Выберите действие (введите число соответствующее необходимому пункту меню):\n1) Показать всех животных в питомнике\n2) Добавить животное\n3) Показать команды животного\n4) Научить животное новой команде\n5) Выход");

      int choise = in.nextInt();
      in.nextLine();
      switch (choise) {
        case 1:
          System.out.print("\033[H\033[J");
          System.out.println(contr.showHumanFriends());
          pressEnterToContinue();
          break;
        case 2:
          System.out.print("\033[H\033[J");
          chooseAnimal();
          break;
        case 3:
          System.out.print("\033[H\033[J");
          showCommands();
          pressEnterToContinue();
          break;
        case 4:
          System.out.print("\033[H\033[J");
          addCommands();
          pressEnterToContinue();
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
    while (true) {
      System.out.print("\033[H\033[J");
      System.out.println(
          "Выберите действие (введите число соответствующее необходимому пункту меню):\n1) Добавить собаку\n2) Добавить кота\n3) Добавить хомяка\n4) Добавить лошадь\n5) Добавить верблюда\n6) Добавить осла\n7) Возврат в основное меню\n");
      int choiseAnimal = in.nextInt();
      in.nextLine();
      switch (choiseAnimal) {
        case 1:
          System.out.print("\033[H\033[J");
          System.out.println(createDog().toString());
          pressEnterToContinue();
          break;
        case 2:
          System.out.print("\033[H\033[J");
          System.out.println(createCat().toString());
          pressEnterToContinue();
          break;
        case 3:
          System.out.print("\033[H\033[J");
          System.out.println(createHamster().toString());
          pressEnterToContinue();
          break;
        case 4:
          System.out.print("\033[H\033[J");
          System.out.println(createHorse().toString());
          pressEnterToContinue();
          break;
        case 5:
          System.out.print("\033[H\033[J");
          System.out.println(createCamel().toString());
          pressEnterToContinue();
          break;
        case 6:
          System.out.print("\033[H\033[J");
          System.out.println(createDonkey().toString());
          pressEnterToContinue();
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
    System.out.print("Введите имя животного, команды которого необходимо увидеть: ");
    String name = in.nextLine();
    System.out.println(contr.showCommands(name));
  }

  public void addCommands() {
    System.out.print("Введите имя животного, которого необходимо научить научить новой команде: ");
    String name = in.nextLine();
    System.out.print("Ввведите новую команду: ");
    String commands = in.nextLine();
    contr.setCommands(name, commands);
  }

  public Dog createDog() {
    System.out.print("Введите имя: ");
    String name = in.nextLine();
    System.out.print("Введите команды через запятую в одну строку : ");
    String commands = in.nextLine();
    try {
      System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
      String[] tempDate = in.nextLine().split("\\.");
      Calendar birthday = new GregorianCalendar(Integer.parseInt(tempDate[2]), Integer.parseInt(tempDate[1]),
          Integer.parseInt(tempDate[0]));
      return contr.createNewDog(name, birthday, commands);
    } catch (Exception e) {
      System.out.println("ERROR: Необходимо вводить дату в корретном формате, например 01.01.2001");
    }
    return null;
  }

  public Cat createCat() {
    System.out.print("Введите имя: ");
    String name = in.nextLine();
    System.out.print("Введите команды через запятую в одну строку : ");
    String commands = in.nextLine();
    try {
      System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
      String[] tempDate = in.nextLine().split("\\.");
      Calendar birthday = new GregorianCalendar(Integer.parseInt(tempDate[2]), Integer.parseInt(tempDate[1]),
          Integer.parseInt(tempDate[0]));
      return contr.createNewCat(name, birthday, commands);
    } catch (Exception e) {
      System.out.println("ERROR: Необходимо вводить дату в корретном формате, например 01.01.2001");
    }
    return null;
  }

  public Hamster createHamster() {
    System.out.print("Введите имя: ");
    String name = in.nextLine();
    System.out.print("Введите команды через запятую в одну строку : ");
    String commands = in.nextLine();
    try {
      System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
      String[] tempDate = in.nextLine().split("\\.");
      Calendar birthday = new GregorianCalendar(Integer.parseInt(tempDate[2]), Integer.parseInt(tempDate[1]),
          Integer.parseInt(tempDate[0]));
      return contr.createNewHamser(name, birthday, commands);
    } catch (Exception e) {
      System.out.println("ERROR: Необходимо вводить дату в корретном формате, например 01.01.2001");
    }
    return null;
  }

  public Horse createHorse() {
    System.out.print("Введите имя: ");
    String name = in.nextLine();
    System.out.print("Введите команды через запятую в одну строку : ");
    String commands = in.nextLine();
    try {
      System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
      String[] tempDate = in.nextLine().split("\\.");
      Calendar birthday = new GregorianCalendar(Integer.parseInt(tempDate[2]), Integer.parseInt(tempDate[1]),
          Integer.parseInt(tempDate[0]));
      return contr.createNewHorse(name, birthday, commands);
    } catch (Exception e) {
      System.out.println("ERROR: Необходимо вводить дату в корретном формате, например 01.01.2001");
    }
    return null;
  }

  public Camel createCamel() {
    System.out.print("Введите имя: ");
    String name = in.nextLine();
    System.out.print("Введите команды через запятую в одну строку : ");
    String commands = in.nextLine();
    try {
      System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
      String[] tempDate = in.nextLine().split("\\.");
      Calendar birthday = new GregorianCalendar(Integer.parseInt(tempDate[2]), Integer.parseInt(tempDate[1]),
          Integer.parseInt(tempDate[0]));
      return contr.createNewCamel(name, birthday, commands);
    } catch (Exception e) {
      System.out.println("ERROR: Необходимо вводить дату в корретном формате, например 01.01.2001");
    }
    return null;
  }

  public Donkey createDonkey() {
    System.out.print("Введите имя: ");
    String name = in.nextLine();
    System.out.print("Введите команды через запятую в одну строку : ");
    String commands = in.nextLine();
    try {
      System.out.print("Введите дату рождения в формате dd.mm.yyyy: ");
      String[] tempDate = in.nextLine().split("\\.");
      Calendar birthday = new GregorianCalendar(Integer.parseInt(tempDate[2]), Integer.parseInt(tempDate[1]),
          Integer.parseInt(tempDate[0]));
      return contr.createNewDonkey(name, birthday, commands);
    } catch (Exception e) {
      System.out.println("ERROR: Необходимо вводить дату в корретном формате, например 01.01.2001");
    }
    return null;
  }

  private void pressEnterToContinue() {
    System.out.println("Нажмите любую клавишу для продолжения...");
    try {
      System.in.read();
    } catch (Exception e) {
    }
  }
}

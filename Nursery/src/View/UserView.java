package View;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import Controller.Controller;
import model.data.Cat;

public class UserView {
  private Scanner in = new Scanner(System.in);
  private Controller contr = new Controller();

  public void startInterface() {
    while (true) {
      System.out.println(
          "Выберите действие:\n1)Показать всех животных в питомнике\n2) Добавить животное\n3) Показать команды животного\n4)Выход");
      int choise = in.nextInt();
      in.nextLine();
      switch (choise) {
        case 1:
          System.out.println(contr.showHumanFriends());
          break;
        case 2:
          System.out.println(createCat().toString());
          break;
        case 3:
          System.out.println("показать команды");
          break;
        case 4:
          System.out.println("До свидание, спасибо за использование приложения");
          return;
        default:
          System.out.println("Введен некорректный пункт меню!");
          return;

      }
    }
  }

  public Cat createCat() {
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

}

import java.util.ArrayList;
import java.util.List;

import Animal.Cat;
import Animal.Dog;
import Animal.HumanFriend;

import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Жучка", new GregorianCalendar(2021, 06, 01), "сидеть, лай");
        // System.out.println(dog1);
        // System.out.println(dog1.getcommands());

        Cat cat1 = new Cat("Лапка", new GregorianCalendar(2019, 06, 22), "мяукай, царапай");
        // System.out.println(cat1);
        // System.out.println(cat1.getcommands());

        List<HumanFriend> listHumanFriend = new ArrayList<>();
        listHumanFriend.add(dog1);
        listHumanFriend.add(cat1);

        Nursery nursery = new Nursery(listHumanFriend);
        System.out.println(nursery);

    }
}

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by zach on 2/4/16.
 */
public class DynamicDataStructures {
    public static void main(String[] args) {
        Person alice = new Person("Alice Smith", 25);
        Person bob = new Person("Bob Smith", 30);
        Person charlie = new Person("Charlie Smith", 40);

        ArrayList<Person> people = new ArrayList<>();
        people.add(alice);
        people.add(bob);
        people.add(charlie);

        for (Person p : people) {
            System.out.println(p.getName());
        }

        /*for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName());
        }*/

        HashMap<String, Person> peopleMap = new HashMap<>();
        peopleMap.put("Alice", alice);
        peopleMap.put("Bob", bob);
        peopleMap.put("Charlie", charlie);

        for (Person p : peopleMap.values()) {
            if (p.getAge() >= 30) {
                System.out.println(p.getName());
            }
        }
    }
}

package gc;

import layout.Person;

import java.util.ArrayList;
import java.util.List;

public class GC {

    public static List<Person> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while (true) {
            Person person = new Person();
            list.add(person);
            if (i % 100_000 == 0) {
                Thread.sleep(100);
            }
            if (i % 10_000_000 == 0) {
                list.clear();
            }
            i++;
        }
    }
}
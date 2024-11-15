package layout;

import java.util.ArrayList;
import java.util.List;

public class MyApplication {

    /*
        jps: prints pid of java running processes
        jmap -histo <pid>: instances information of classes
     */

    public static void main(String[] args) throws InterruptedException {
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 50_000_000; i++) {
            persons.add(new Person());
        }

        Thread.sleep(1_000_000);
    }
}
package lambda.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;


public class Main {
    public Main() {
    }

    private static final List<Person> persons = Arrays.asList(
            new Person("George", "Dragomir", "gdragomir@gmail.com", 28),
            new Person("Alex", "Dragomir", "adragomir@gmail.com", 26),
            new Person("Marius", "Dragomir", "mdragomir@gmail.com", 23),
            new Person("Ionut", "Dragomir", "idragomir@gmail.com", 11),
            new Person("Claudiu", "Dragomir", "cdragomir@gmail.com", 17)
    );

    public static void main(String[] args) {

        filter(person -> person.getAge() > 18);
        System.out.println("---------------------------------------- ");
        filter(person -> person.getEmail().startsWith("adragomir"));
        System.out.println("---------------------------------------- ");
        filter(person -> person.getAge() > 18 && person.getEmail().startsWith("gdragomir"));
        System.out.println("---------------------------------------- ");

        filter(person -> {
            if (person.getFirstName().startsWith("G")) {
                return true;
            }
            return person.getAge() > 25;
        });
        System.out.println("---------------------------------------- ");
        filter(
                person -> person.getAge() > 18,
                person -> person.getFirstName() + " " + person.getLastName()
        );
        System.out.println("---------------------------------------- ");
        filter(
                person -> person.getAge() > 18,
                person -> Integer.toString(person.getAge())
        );
        System.out.println("---------------------------------------- ");
        filter(
                person -> person.getAge() > 18,
                person -> person.getFirstName() + " " + person.getLastName(),
                System.err::println /*System.err::println*/
        );
    }

    public static void filter(Predicate<Person> predicate) {
        for (Person person : persons) {
            if (predicate.test(person)) {
                System.out.println(person);
            }
        }
    }

    public static void filter(Predicate<Person> predicate, Function<Person, String> function) {
        for (Person person : persons) {
            if (predicate.test(person)) {
                System.out.println(function.apply(person));
            }

        }
    }

    public static void filter(
            Predicate<Person> predicate,
            Function<Person, String> function,
            Consumer<String> consumer
    ) {
        for (Person person : persons) {
            if (predicate.test(person)) {
                consumer.accept(function.apply(person));
            }

        }
    }
}
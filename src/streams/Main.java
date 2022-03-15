package streams;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Stream;

//1. Using streams, for a given lists:
//- [„John”, „Sarah”, „Mark”, „Tyla”, „Ellisha”, „Eamonn”]
//- [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
//a) Sort the list.
//b) Print only those names, that start with „E” letter.
//c) Print values greater than 30 and lower than 200.
//d) Print names uppercase.
//e) Remove first and last letter, sort and print names.
//f) *Sort backwards by implementing reverse Comparator and using lambda expression.
public class Main {
   /* private static final List<String > NAMES = new ArrayList<>();
    static {
    NAMES.add("George");
    NAMES.add("Marian");
    NAMES.add("Marius");
    NAMES.add("Mihai");
    NAMES.add("Alex");

    }

    private static final List<Integer> NUMBERS = Arrays.asList(
            1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50
    );

    public static void main(String[] args) {
        NAMES.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("==================");
        NUMBERS.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("==================");
        NAMES.stream()
                .filter(name->name.startsWith("M"))
        .forEach(name-> System.out.println(name));
        System.out.println("==================");
        NUMBERS.stream()
                .filter(number->number>30&& number<200)
                .forEach(number-> System.out.println(number));
        System.out.println("==================");
        NAMES.stream()
                .map(name->name.toUpperCase(Locale.ROOT))
                .forEach(name-> System.out.println(name));

        System.out.println("==================");

        NAMES.stream()
                .map(name->name.substring(1, name.length()-1))
                .sorted()
                .forEach(name-> System.out.println(name));
        System.out.println("==================");
        NUMBERS.stream()
                .filter(number->number!=0)
                .sorted((number2, number1) -> number1.compareTo(number2))
                .forEach(number-> System.out.println(number));

    }
}*/

//List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes")
//- Print All Courses individually
//- Print Courses Containing the word "Spring"
//- Print Courses Whose Name has at least 4 letters
//- Print the number of characters in each course name

    private static List<String> courses =List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");

    public static void main(String[] args) {
        courses.stream()
                .forEach((System.out::println));

        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
        System.out.println("=================================");

        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
        System.out.println("=================================");

        courses.stream()
                .map(course ->course.length())
                .forEach(numberOfCharacters -> System.out.println(Integer.toString(numberOfCharacters)));
        System.out.println("=================================");

        courses.stream()
                .map(course -> course.toUpperCase(Locale.ROOT))
                .map(course -> "test-".concat(course))
                .sorted()
                .skip(1)
                .limit(4)
                .forEach(course -> System.out.println(course));
    }
}

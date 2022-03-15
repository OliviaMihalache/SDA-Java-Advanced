package lambda.ex1;


import java.util.function.Consumer;


import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * Write a program that reads a collection of strings, separated by one or more whitespaces, from the console and then prints
 * them onto the console. Each string should be printed on a new line. Use a Consumer<T>.
 * - Input: Pesho Gosho Adasha
 * - Output:
 * - Pesho
 * - Gosho
 * - Adasha
 */
public class Main {

    public static final String testValue = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, " + "and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ";

    public static void main(String[] args) {
//        stringFormater(word-> System.out.println(word));
//        stringFormater(word-> System.err.println(word));
//        stringFormater(word-> System.out.print(word+" "));

//        stringFormater(word -> {
//            if (word.length() > 5) {
//                System.out.println(word);
//            }
//        });

//        stringFormater(() -> new Random().nextInt(1000) + " ");

        stringFormatter(
                word -> {
                    if (word.length() > 5) {
                        System.out.println(word);
                    }
                },
                () -> Integer.toString(new Random().nextInt(1000))

        );

    }

    public static void stringFormater(Consumer<String> consumer) {
        String[] arrayOfStrings = testValue.split(" ");

        for (String element : arrayOfStrings) {
//            System.out.println(arrayOfString);
            consumer.accept(element);
        }

    }

    public static void stringFormater(Supplier<String> supplier) {
        String[] arrayOfStrings = testValue.split(" ");

        for (String element : arrayOfStrings) {
            String valueFromSupplier = supplier.get();
            System.out.println(element + valueFromSupplier);

        }
    }

    public static void stringFormatter(Consumer<String> consumer, Supplier<String> supplier) {
        String[] arrayOfStrings = testValue.split(" ");

        for (String element : arrayOfStrings) {

            String value = element + supplier.get();
            consumer.accept(value);

        }
    }

}
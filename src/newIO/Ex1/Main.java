package newIO.Ex1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
 * ##### IO Exercise 1
 * Create a file with a „lorem ipsum" paragraph within – it can be done by copy-pasting existing paragraph or generating it dynamically using Java library.
 * - Read that file.
 * - Count words.
 * - *Count special signs (like comma, dot, spaces).
 * - *Select one word and print it's number of occurrences.
 */

         public class Main {

            public static void main(String[] args) throws IOException {

                Path path = Paths.get("C:\\Users\\John\\Desktop\\text.txt");

                List<String> fileLines = Files.readAllLines(path);
                Map<String, Integer> map = new HashMap<>();

                for (String fileLine : fileLines) {
                    String[] words = fileLine.split(" ");
                    for (String word : words) {
                        String newWord = word;
                        if (word.contains("?")) {
                            map.putIfAbsent("?", 0);
                            int occurrences = map.get("?");
                            map.put("?", occurrences + 1);
                            newWord = newWord.replace("?", "");
                        }
                        map.putIfAbsent(newWord, 0);
                        int occurrences = map.get(newWord);
                        map.put(newWord, occurrences + 1);
                    }
                }
                System.out.println(map);

                List<String> newFileContent = new ArrayList<>();
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    newFileContent.add(entry.toString());
                }
                Files.write(path, newFileContent);


            }

        }


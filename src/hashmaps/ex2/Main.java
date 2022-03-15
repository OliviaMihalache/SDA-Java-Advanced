package hashmaps.ex2;
//Write a program which count the number of each character occurring in a string.
//Read the string from the command line.
//Ex: {d=9, o=6, r=7, W=5}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String defaultString = "HelloWorld";
        Map<Character, Integer> map = new HashMap<>();

        char[] charArray = defaultString.toCharArray();

        for(char mapKey:charArray){
            map.putIfAbsent(mapKey, 0);

            int existingValue=map.get(mapKey);
            map.put(mapKey, existingValue+1);

        }
        System.out.println(map);

    }
}

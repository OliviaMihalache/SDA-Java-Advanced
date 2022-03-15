package collections.set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("blue");
        colors.add("pink");
        colors.add("yellow");
        colors.add("green");
        colors.add("red");
        System.out.println(colors);
        String color = "violet";

        if(colors.contains(color)){
            System.out.println(color);
        }
        for(String color1:colors){
            if(color1.startsWith("y"))
            {
                System.out.println(color1);
            }
        }
        colors.remove(("yellow"));
        if(colors.isEmpty()){
            System.out.println("List is empty");
        }
        else{
            System.out.println("List is not empty");
        }
    }
}

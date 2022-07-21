package com.galvanize;
import java.lang.reflect.Array;
import java.net.URI;
import java.nio.file.LinkPermission;
import java.time.LocalDateTime;
import java.util.*;
import java.util.spi.CurrencyNameProvider;

import static com.galvanize.ToSentence.toSentence;

public class Application {

    public static ArrayList<String> sortArray(String[] inputArray) {
        ArrayList<String> result = new ArrayList<>(Arrays.asList(inputArray));
        result.sort(null);
        return result;
    }

    public static HashMap<Integer, String> genHashMap() {
        HashMap<Integer, String> result = new HashMap<>();
        result.put(747, "Airplane");
        result.put(10, "Laphroaig");
        return result;
    }
    // organizing code exercises
    LocalDateTime now = LocalDateTime.now();
    public class Browser {
        private URI currentPage;
        private ArrayList<String> history;
        private LocalDateTime visitedAt;
        private HashMap<String, Integer> visitCount;
        private boolean on;
    }




    public static void main(String[] args) {
//        fizzBuzz();
        /*
        String[] names = new String[]{"eliza", "adam"};
        ArrayList<String> notSorted = new ArrayList<>(Arrays.asList(names));
        System.out.println("testing creating arraylist" + notSorted);
        // before calling the method, must instantiate new arraylist, otherwise
        // there will be an error: "Non-static variable cannot be referenced from a static context"
        ArrayList<String> sortedWithMethod = sortArray(names);
        System.out.println(sortedWithMethod);
        // testing hashmap exercise
        HashMap<Integer, String> testHM = genHashMap();
        System.out.println("hm created" + testHM);

        //testing accumulator exercise
        String [] test1 = {"Alice", "Bob", "Carol"};
        String test1String = toSentence(test1);
        System.out.println(test1String);

        String [] test2 = {"Alice"};
        String test2String = toSentence(test2);
        System.out.println(test2String);

        String [] test3 = {"Alice", "Bob", "Carol", "Danny"};
        String test3String = toSentence(test3);
        System.out.println(test3String);

        String [] test4 = {""};
        String test4String = toSentence(test4);
        System.out.println(test4String);

        CompiledProgrammingLanguage java = new CompiledProgrammingLanguage();
        java.setName("Java");
        java.setCompilerCommand("javac");
        //        java.getCompilerCommand(); // => returns "javac"
        System.out.println(java.createString());
        */
        // inheritance - overriding
        InPersonCourse course = new InPersonCourse(Arrays.asList("Eliza", "Angelica"), "Peggy");
        System.out.println(( course.getDescription())); // => returns Eliza, Angelica (taught by Peggy)

        // nested classes checkpoint
        Product prod = new Product("car", 150);
        System.out.println(prod.getValueInCents());
        Product.Currency dollars = prod.getCurrency();
        System.out.println("dollars: " +dollars.getUSD());
//        System.out.println(dollars.getUSD());




    }
}

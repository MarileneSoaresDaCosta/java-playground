package com.galvanize;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Application {
    static void fizzBuzz() {
        System.out.println("This is fizzBuzz");
        Scanner userObj = new Scanner(System.in);
        System.out.println("Enter an integer:");
        String userNum = userObj.nextLine();
        int num = Integer.parseInt(userNum);
        // fizzBuzz logic
        String result= "";
        if(num % 3 == 0) {
            result += "Fizz";
        }
        if (num % 5 == 0) {
            result += "Buzz";
        }
        if(num % 3 != 0 && num % 5 != 0) {
            System.out.println(num);
        } else {
            System.out.println(result);
        }
    }

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

    public static String toSentence(String[] input){
        StringBuilder result = new StringBuilder();
        // empty case
        if(input.length == 0 || input[0] == "") {
            return result.toString();
        }
        // normal case, only one valid string
        if(input.length == 1) {
            result.append(input[0]);
            return result.toString();
        }
        if(input.length == 2) {
            result = new StringBuilder(input[0] + " and " + input[1]);
            return result.toString();
        }
        // length > 3 - use string builder class
        for (int i = 0; i < input.length - 1; i++) {
            if(i == 0) {
                result.append(input[i]);
            } else {
                result.append(", ").append(input[i]);
            }
        }
        result.append(" and ").append(input[input.length - 1]);

        return result.toString();
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
        */
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
    }
}

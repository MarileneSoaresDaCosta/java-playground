package com.galvanize;
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
//        System.out.println(String.format("You chose %d", num));

    }
    public static void main(String[] args) {

        fizzBuzz();

        /*
        System.out.println(String.format("num of args: %d", args.length));
        if(args.length < 1) {
            System.out.println("Please provide an argument!");
        } else {
            System.out.println(String.format("Argument provided: %s", args[0]));
        }

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username:");
        String userName = myObj.nextLine();
        System.out.println(String.format("Hello %s", userName));
         */


    }
}

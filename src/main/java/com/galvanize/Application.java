package com.galvanize;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

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
    }
}

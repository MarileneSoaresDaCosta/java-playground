package com.galvanize;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        if(args.length < 2) {
            System.out.println("Please provide name and email.");
            System.exit(0);
        } else {
            String name = args[0];
            String email = args[1];
            System.out.println(String.format("%s <%s>", name, email));
        }

    }
}

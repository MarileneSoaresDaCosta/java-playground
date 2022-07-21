package com.galvanize;

import java.util.Scanner;

public class FizzBuzz {
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
}

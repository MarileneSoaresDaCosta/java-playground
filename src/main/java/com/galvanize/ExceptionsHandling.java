package com.galvanize;

public class ExceptionsHandling {
    public static void doIt(int bar) {
        int foo = 0;
        int baz = 0;

        try {
            foo = bar / baz;
        } catch (NullPointerException ex) {
            System.out.println("Something blew up!");
        } finally {
            System.out.println("Done");
        }

        System.out.println("foo: " + foo);
    }



}

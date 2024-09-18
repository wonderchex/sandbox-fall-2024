package com.sandbox.exception;

import java.util.Scanner;

public class HelloException {

    public static void main(String[] args) {

        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            // finally do something
        }
        // java 7 multi-try-catch
        try {

        } catch (ArithmeticException | NullPointerException e) {
            e.printStackTrace();
        }

        //try-with-resources
        try (Scanner scanner1 = new Scanner(System.in)) {
            //do something
        }

        Scanner scanner2 = null;
        try {
            scanner2 = new Scanner(System.in);
            //do something
        } finally {
            if (scanner2 != null) {
                scanner2.close();
            }
        }

    }
}

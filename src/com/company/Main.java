package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("a");
        int a = scanner.nextInt();
        System.out.println("b");
        int b = scanner.nextInt();
        System.out.println("c");
        int c = scanner.nextInt();
        System.out.println("d");
        int d = scanner.nextInt();


        if (a > b && a > c && a > d) {
            if (b > c && b > d) {
                System.out.println(a + b);
            } else if (c > b && c > d) {
                System.out.println(a + c);
            } else {
                System.out.println(a + d);
            }
        } else if (b > a && b > c && b > d) {
            if (a > c && b > c && b > d) {
                System.out.println(a + b);
            } else if (c > a && c > d) {
                System.out.println(b + c);
            } else {
                System.out.println(b + d);
            }  if (d > c && d > b) {
                System.out.println(d + c);
            }
            {
                System.out.println("teng");
            }
        }














































    }
}

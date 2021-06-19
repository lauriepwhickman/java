package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void circleArea(){
        final float PI = 3.14f;
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the radius of the circle: ");
        int radius = myObj.nextInt();
        float area = (float) (PI * (Math.pow(radius, 2)));
        System.out.println("The area of the circle is: "+area);
    }

    public static void main(String[] args) {
//        while (true) {
//            Scanner myObj = new Scanner(System.in);
//            System.out.println("Enter username: ");
//            String userName = myObj.nextLine();
//            int length = userName.length();
//            if (length < 20) {
//                System.out.println("Perfect. Welcome " + userName);
//                break;
//            }
//            System.out.println("Sorry that username is too long");
//        }
        circleArea();
    }
}
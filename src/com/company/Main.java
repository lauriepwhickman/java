package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void function(){
        int [] [] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

    }

    public static void main(String[] args) {
        while (true) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter username: ");
            String userName = myObj.nextLine();
            int length = userName.length();
            if (length < 20) {
                System.out.println("Perfect. Welcome " + userName);
                break;
            }
            System.out.println("Sorry that username is too long");
        }
    }
}
package com.packagevikas;

import javax.swing.*;
import java.util.Scanner;

public class fizz {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("enter the number");
        int number = num.nextInt();
        if (number%5==0) {
            System.out.print("FIZZZZ");
        }
        else if(number%3==0)
        {
            System.out.println("BUZZ");
        }
        else{
            System.out.println("FIZZBUZZ");
        }
        }
    }




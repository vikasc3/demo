package com.packagevikas;

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        byte numberofmonthsyear = 12;
        byte percentage = 100;
        int principal=0;
        float rate=0;
        int time=0;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("enter the principal");
            principal = scan.nextInt();
            if (principal > 1000 && principal <= 100000)
            System.out.println("enter the number between 1000 and 10000000");
            break;

        }
        System.out.println(principal + " is your principal");

        while(true)
        {
            System.out.println("enter the rate%");
            rate = scan.nextFloat();
            if(rate >1&& rate<30)
                System.out.println("enter between range");
            break;
        }
        System.out.println(rate + "%" + " is your rate of intrest");

        while(true) {
            System.out.println("enter the time");
            time = scan.nextInt();
            if (time > 1 && time < 20)
                System.out.println(time + "  is your time");
            break;
        }

        double simpleintrest = (principal * rate * time) / percentage;
        System.out.println(simpleintrest);
    }
}


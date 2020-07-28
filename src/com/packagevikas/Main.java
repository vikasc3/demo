package com.packagevikas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] num=new int[3][3];
        num[0][0]=3;
        num[0][1]=1;
        num[0][2]=1;
        num[1][2]=2;
        num[2][2]=2;
        System.out.println(Arrays.deepToString(num));
    }
}

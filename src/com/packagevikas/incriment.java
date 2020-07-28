package com.packagevikas;

public class incriment {
    public static void main(String args[]) {
        int boy = 2;
        System.out.println(++boy);     //first increment then initialize
        System.out.println(boy++);     // first intualize then incremnt
       boy =boy+4;
        System.out.println(boy);
        boy += 5;
        System.out.println(boy);
    }
}
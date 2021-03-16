package com.example.learnroutin;

public class GrammerLearn2{
    public static void main(String[] args) {
        int a = 10000;
        System.out.println(a==a); // 输出“true”
        Integer A=new Integer(a);
        Integer another_A=new Integer(a);
        System.out.println(A==another_A);  // 输出“true”
        int number =1000_000;
        System.out.println(number);
    }
    int number=5;

    public void setNumber(int number) {
        this.number=number;
    }

    public int getNumber() {
        return number;
    }
}


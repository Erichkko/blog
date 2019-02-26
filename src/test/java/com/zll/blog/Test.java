package com.zll.blog;

public class Test {


   @org.junit.Test
    public void test1(){
        int m = 500;
        int n1 = m%500;
        int n2 = m/500;
        System.out.println("n1 == "+n1);
        System.out.println("n2 == "+n2);
    }
}

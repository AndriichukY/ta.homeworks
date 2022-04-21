package com.softserve.homework01;

public class Main {
    public static void main(String[] args) {
        StringVerification service = new StringVerification();
        String s= "(()))";
        System.out.println(service.verifyBrackets(s));
    }
}

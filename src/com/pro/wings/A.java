package com.pro.wings;

public class A {

    public static void main(String[] args) {
        System.out.println("Hello Git");
        print("Hey");
        A obj = new A();

        String res = method(obj);
        System.out.println(res);

        System.out.println(method(obj));
    }

    private static void print(String s) {

        s = s.concat(" Java Developer");
        System.out.println(s);

    }

    public static String method(A a)// a = obj
    {
        System.out.println("Printing object of A : " +a);
        return "hey";
    }
}

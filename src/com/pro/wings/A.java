package com.pro.wings;

public class A {

    public static void main(String[] args) {
        System.out.println("Hello Git");
        print("Hey");
        A obj = new A();

//        String result = method(obj);
        System.out.println("");



    }

    private static void print(String s) {

        s = s.concat(" Java Developer");
        System.out.println(s);

    }

    public static String method(A a, String s, int i)// a = obj
    {
        System.out.println("alksjd");
        System.out.println("Printing object of A : " +a);
        String hs = String.valueOf(a.hashCode());
        System.out.println("Printing object of A : " +a);
        System.out.println("Printing object of A : " +a);
        return hs;
    }
}

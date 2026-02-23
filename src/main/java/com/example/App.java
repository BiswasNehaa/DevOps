package com.example;

public class App 
{
    public int add(int a, int b) {
        return a * b;
    }
    public static void main( String[] args )
    {
        App calc= new App();
        int result = calc.add(5, 3);
        System.out.println( "Result: " + result );
    }
}

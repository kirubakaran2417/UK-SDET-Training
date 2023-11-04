package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    //create a method which need to print even numbers from 1 to 20
    public static void printEvenNumbers() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

}

package basics;
//importing from package

import java.util.Scanner;

public class TakingInputfromconsole {
    //taking input from console (runtime)
    public static void main(String[] args) {
        //scanner-this is used to take input from console
        Scanner s=new Scanner(System.in);//scanner object created here to call methods
        System.out.println("Enter your name");
        String name=s.next();//next method used read strings
        System.out.println("Enter your age");
        int age=s.nextInt();//nextint used to read integers
        System.out.println("Enter your address");
        String address=s.next();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
    }
}

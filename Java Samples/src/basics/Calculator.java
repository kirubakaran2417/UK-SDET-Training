package basics;

public class Calculator {
    //declaring variables
    int a;
    int b;
    //create a method
    //what is method-specific function which is doing an action with collection of statements

    void add(){
        int c=a+b;
        System.out.println(c);
    }
    void sub(){
        int c=a-b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.a=10;
        c.b=20;
        c.add();
        c.sub();
    }


}

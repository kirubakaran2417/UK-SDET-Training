package encapsulation;

import inheritance.Parentclass;

public class Childclass extends Parentclass {

    int c=a+b;
    public static void main(String[] args) {
        Childclass child = new Childclass();
        child.display();
        System.out.println(child.c);
    }
}

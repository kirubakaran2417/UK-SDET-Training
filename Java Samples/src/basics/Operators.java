package basics;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic operations--->    +,-,*,/,%
        int a = 10;
        int b = 4;
        double c = a%b;
        System.out.println(c);

        //Assignment operators---> =,+=,-=
        int num = 10;
        num += 5;
        System.out.println(num);

        //Relational operators---> <,>,<=,>=,==,!=
        int x=25;
        int y=15;
        int z=10;
        System.out.println(x!=y);

        //logical operators---> &&,||,!

        System.out.println(x>y && y<z);
        System.out.println(x>y || y<z);

        //unary operators---> ++,-- increment/decrement
       //a++ ---> a+1
        //a-- ---> a-1


    }
}

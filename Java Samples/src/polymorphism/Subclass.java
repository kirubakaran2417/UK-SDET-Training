package polymorphism;

public class Subclass extends Superclass{
    public void display(){
        super.display();
        System.out.println("im method of subclass");
    }

    public static void main(String[] args) {
        Subclass sub=new Subclass();
        sub.display();
    }
}

package abstraction;

public class Rectangle extends Delhi implements Shape {
    @Override
    public void getArea(int length, int breadth) {
        System.out.println(length * breadth);
    }

    @Override
    public void idverification() {
        System.out.println("im method of Delhi");
    }
}

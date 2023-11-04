package abstraction;

public class Polygon implements Shape,Color{
    @Override
    public void getArea(int length, int breadth) {
        System.out.println(length * breadth);
    }

    @Override
    public void setColor(String color) {
        System.out.println(color);
    }
}

package polymorphism;

public class Addition {//Method overloading
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        Addition a=new Addition();
        System.out.println(a.add(10.24,20.45));

    }
}

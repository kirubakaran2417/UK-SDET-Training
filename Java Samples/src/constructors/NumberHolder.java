package constructors;

public class NumberHolder {
    int number;

    //default constructor initializes the number to default value
   public NumberHolder(int number) {
       this.number = number;
   }
    public static void main(String[] args) {
        NumberHolder n=new NumberHolder(10);
        System.out.println(n.number);

    }
}

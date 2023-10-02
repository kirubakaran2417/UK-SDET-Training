package basics;

public class Methods2 {

  public int add(int a,int b){//parameters
    return a+b;
  }
  public int sub(int a,int b){
    return a-b;
  }

    public static void main(String[] args) {
        Methods2 m=new Methods2();
        int sum=m.add(10,20);//arguments
        System.out.println(sum);
        int diff=m.sub(10,20);
        System.out.println(diff);
    }
}

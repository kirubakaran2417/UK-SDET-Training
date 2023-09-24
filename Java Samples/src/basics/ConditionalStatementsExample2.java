package basics;

public class ConditionalStatementsExample2 {
    public static void main(String[] args) {
        int total =80;
        if(total>=90 && total<=100){
            System.out.println("Distinction");
        }else if(total>=80 && total<=90){
            System.out.println("First Class");
        }else if(total>=70 && total<=80){
            System.out.println("Second Class");
        }else{
            System.out.println("Fail");
        }

    }
}

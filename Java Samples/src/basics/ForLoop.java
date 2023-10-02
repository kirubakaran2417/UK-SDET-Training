package basics;

public class ForLoop {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
//12345
//1234
//123
//12
//1
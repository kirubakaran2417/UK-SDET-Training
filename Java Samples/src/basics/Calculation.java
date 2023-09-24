package basics;

public class Calculation {
    public static void main(String[] args) {
        int tamil = 99;
        int english = 94;
        int maths = 97;
        int science = 96;
        int social = 95;
        //calculating total
        int total = tamil + english + maths + science + social;
        System.out.println(tamil + english + maths + science + social);
        System.out.println("Total marks: "+total);
        //calculating average
        double average = total / 5;
        System.out.println("Average marks: "+average);
        //calculating percentage
        int percentage = total * 100 / 500;
        System.out.println("Percentage: "+percentage+"%");



    }
}

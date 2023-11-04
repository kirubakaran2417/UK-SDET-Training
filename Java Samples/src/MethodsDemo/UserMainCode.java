package MethodsDemo;

public class UserMainCode {
    /*
    This code calculates the sum of squares of even digits
    in a given number.
     It iterates through each digit of the number,
     checks if it is even,
     and adds the square of the even digit to the sum.
    Finally, it returns the sum.
     */

    public static int sumOfSquaresOfEvenDigits(int n){
        int n1;
        int sum = 0;
        while(n!=0){
            n1=n%10;
            if(n1%2==0){
                sum+=n1*n1;
            }
            n=n/10;
        }
        return sum;
    }

}

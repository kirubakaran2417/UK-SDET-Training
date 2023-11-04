package arraysDemos;

import basics.Calculation;

import java.util.Arrays;

public class ArrayDemo {

    int a;//built in data type-primitive
    Calculation c;//user defined data type-non primitive

    public static void main(String[] args) {
        //how do arrays in java work
        //array is a data structure or container that store the same
        //type  elements in a sequential format
        int mark1=78;
        int mark2=89;
        int mark3=90;
        int mark4=100;
        int mark5=78;
        //array declaration and initialization
        int[] marks=new int[5];
        marks[0]=98;
        marks[1]=78;
        marks[2]=90;
        marks[3]=100;
        marks[4]=78;

        String[] names=new String[5];
        names[0]="kiruba";
        names[1]="gb";
        names[2]="femi";
        names[3]="loki";
        names[4]="sowmya";

        int[] marks2={98,78,90,100,78};
        Arrays.sort(marks2);
        System.out.println(marks2[4]);
        String[] names2={"kiruba","gb","femi","loki","sowmya"};

        //accessing the element
        System.out.println(marks2[1]);
        System.out.println(names2[2]);

        System.out.println(marks2.length);

        for (int i=0; i<marks2.length; i++)
        {
            System.out.println(marks2[i]);
        }
    }
}

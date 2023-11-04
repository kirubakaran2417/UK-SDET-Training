package arraysDemos;

public class Multidimentionalarray {
    public static void main(String[] args) {
        int[][] marks={
            {98,78,90,100,78}, //0
            {85,87,98,99,76},  //1
            {78,98,90,100,78}  //2
        };

        System.out.println(marks[0][4]);

        for (int i=0; i<marks.length; i++) {
            for (int j=0; j<marks[i].length; j++) {
                //is it done?
            }
        }
    }
}

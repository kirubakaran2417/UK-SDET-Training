public class exceptionHandling {

    public static void main(String[] args) {
        //Exception is an unwanted event that interrupts the normal flow of a program
        //types of exceptions: checked exception, unchecked exception
//        try ...catch blocks
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        try{
            System.out.println(5/0);
        }catch (Exception e){
            System.out.println("5 cant be divided by 0");
        }finally {
            System.out.println("finally");
        }
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
    }

    //compile time exception-IOException,interruptedException
    //run time exception
}

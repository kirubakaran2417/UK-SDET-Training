package stringsdemo;

public class StringsDemo {
    public static void main(String[] args) {
        String name="kiruba";
        String name2="KIRUBA";
        //comparing two strings
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name==name2);

        //accessing strings
        System.out.println(name.charAt(2));//r
        System.out.println(name.indexOf('u'));//3
        System.out.println(name.concat(" is a good boy"));//kiruba is a good boy
        System.out.println(name.toLowerCase());//kiruba
        System.out.println(name.toUpperCase());//KIRUBA
        char[] chararray=name.toCharArray();//['k','i','r','u','b','a']
        System.out.println(chararray);//['k','i','r','u','b','a']
        System.out.println(name.length());//6
    }
}

package Array;

public class ArrayStr {
    public static void main(String[] args) {
        String a= new String("hello");
        String b="hello";
        String c=new String("hello");
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a==c);
        System.out.println(b.equals(c));
    }
}

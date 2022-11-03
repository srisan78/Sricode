package Array;

public class StringSub {
    public static void main(String[] args) {
     String   str="my name sridhar muniyappa";
     int indexOfs=str.indexOf('n');
     int endIndexOf=str.indexOf(' ',indexOfs);
     String subString=str.substring(indexOfs,endIndexOf);
        System.out.println(subString);
    }
}

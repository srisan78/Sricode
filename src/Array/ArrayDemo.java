package Array;

public class ArrayDemo {

    public static void main(String[] args) {

        char[] charArray=new char[4];
       charArray[0]='a';
       charArray[1]='b';
       charArray[2]='c';
       charArray[3]='d';
       for(int i=0;i< charArray.length;i++){
           System.out.println(charArray[i]);
       }

    }
}

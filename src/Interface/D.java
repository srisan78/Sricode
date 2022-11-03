package Interface;

public class D implements B,c {
    public static void main(String[] args) {
D d=new D();
d.display();
    }


    @Override
    public void display() {
        B.super.display();
    }
}


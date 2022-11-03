package OOPS;

public class Cat extends Animal implements Walkable {
    public void breath() {
        System.out.println("Cat can Breath");
    }

    @Override
    public void walk() {
        System.out.println("Cat can walk");
    }


}

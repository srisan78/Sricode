package OOPS;

public class Dog extends Animal implements Walkable,Swim,Speakable{
    public void breath() {
        System.out.println("this can breath");
    }

    @Override
    public void walk() {
        System.out.println("Dog can walk");
    }

    @Override
    public void Swimming() {
        System.out.println("dog can swim");
    }

    @Override
    public void speak() {
        System.out.println("BOW");
    }
}

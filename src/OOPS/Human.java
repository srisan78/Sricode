package OOPS;

public class Human extends Animal implements Walkable,Speakable,Swim{
    public void breath() {
        System.out.println("Human will Breath");
    }

    @Override
    public void speak() {
        System.out.println("Human can speak");
    }

    @Override
    public void Swimming() {
        System.out.println("Human can Swim");
    }

    @Override
    public void walk() {
        System.out.println("Human can Walk");
    }
}

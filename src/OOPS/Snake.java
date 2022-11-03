package OOPS;

public class Snake implements Swim {
    public void breath() {
        System.out.println("snake can breath");
    }

    @Override
    public void Swimming() {
        System.out.println("Snake can Swim");
    }
}

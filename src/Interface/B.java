package Interface;

public interface B extends A{
    default void display() {
        System.out.println("Class b");
    }
}

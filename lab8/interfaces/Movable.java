package lab8.interfaces;

public interface Movable {
    public static String stala = "moaj stala";
    void move(int amount);

    default String defaultMethod(){
        return "String";
    }
}

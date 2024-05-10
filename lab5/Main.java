package lab5;

public class Main {

    public static void main(String[] args) {
        Shape s = new Rectangle(2,2);
        Shape s1 = new Triangle(1,2,3,4);
        Shape s2 = new Square(6);

        Shape[] shapes = new Shape[]{s,s1,s2};

        for (Shape sh: shapes){
            System.out.println(sh.getName());
        }
    }
}

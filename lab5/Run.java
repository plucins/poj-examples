public class Run {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,2,3, 2);
        Rectangle rectangle = new Rectangle(2,3);
        Square square = new Square(5);

        Shape[] shapes = { triangle,rectangle,square };

        for(Shape s: shapes){
            System.out.println(s.name);
        }

    }
}

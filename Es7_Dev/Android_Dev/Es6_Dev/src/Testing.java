import Principal.Shape;

public class Testing extends Shape {

    public static void main(String[] args) {

        Shape news = new Shape();

        Shape circle = new Shape(5);
        String shapeCircle = circle.getShapeDetails();
        System.out.println(shapeCircle);

        Shape square = new Shape(4, 5);
        String shapeSquare = square.getShapeDetails();
        System.out.println(shapeSquare);

        Shape rectangle = new Shape(4, 4,2);
        String shapeRectangle = rectangle.getShapeDetails();
        System.out.println(shapeRectangle);

        Shape triangle = new Shape(3, 5,4,4);
        String shapeTriangle = triangle.getShapeDetails();
        System.out.println(shapeTriangle);

    }

}

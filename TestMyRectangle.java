/* 
Java QAP 2 
By: Brian Jackman
2024/10/08
 */

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 4);
        MyPoint p2 = new MyPoint(5, 1);
        MyRectangle rectangle = new MyRectangle(p1, p2);

        System.out.println("Top-left point: " + rectangle.getTopLeft());
        System.out.println("Bottom-right point: " + rectangle.getBottomRight());
        System.out.println("Width of the rectangle: " + rectangle.getWidth());
        System.out.println("Height of the rectangle: " + rectangle.getHeight());
        System.out.println("Area of the rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());

        MyPoint p3 = new MyPoint(2, 5);
        rectangle.setTopLeft(p3);
        System.out.println("New top-left point: " + rectangle.getTopLeft());

        MyPoint p4 = new MyPoint(6, 2);
        rectangle.setBottomRight(p4);
        System.out.println("New bottom-right point: " + rectangle.getBottomRight());

        System.out.println("Updated width of the rectangle: " + rectangle.getWidth());
        System.out.println("Updated height of the rectangle: " + rectangle.getHeight());
        System.out.println("Updated area of the rectangle: " + rectangle.getArea());
        System.out.println("Updated perimeter of the rectangle: " + rectangle.getPerimeter());
    }
}
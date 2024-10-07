/* 
Java QAP 2 
By: Brian Jackman
2024/10/08
 */

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);
        MyLine line = new MyLine(p1, p2);

        System.out.println("Begin point: " + line.getBegin());
        System.out.println("End point: " + line.getEnd());
        System.out.println("Length of the line: " + line.getLength());
        System.out.println("Gradient of the line: " + line.getGradient());

        MyPoint p3 = new MyPoint(3, 3);
        line.setBegin(p3);
        System.out.println("New begin point: " + line.getBegin());

        MyPoint p4 = new MyPoint(7, 8);
        line.setEnd(p4);
        System.out.println("New end point: " + line.getEnd());

        System.out.println("Updated length of the line: " + line.getLength());
        System.out.println("Updated gradient of the line: " + line.getGradient());

        line.setBeginX(0);
        line.setBeginY(0);
        System.out.println("Updated begin point: " + line.getBegin());

        line.setEndX(5);
        line.setEndY(5);
        System.out.println("Updated end point: " + line.getEnd());

        System.out.println("Begin point coordinates: " + java.util.Arrays.toString(line.getBeginXY()));
        System.out.println("End point coordinates: " + java.util.Arrays.toString(line.getEndXY()));
    }
}
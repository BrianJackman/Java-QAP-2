/* 
Java QAP 2 
By: Brian Jackman
2024/10/08
 */

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    // Constructors
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getters and Setters
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getBeginXY() {
        return new int[] { begin.getX(), begin.getY() };
    }

    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    public int[] getEndXY() {
        return new int[] { end.getX(), end.getY() };
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    // Methods to calculate length and gradient
    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - begin.getX(), 2) + Math.pow(end.getY() - begin.getY(), 2));
    }

    public double getGradient() {
        if (end.getX() == begin.getX()) {
            return Double.POSITIVE_INFINITY; // Gradient is infinite for vertical lines
        }
        return (double) (end.getY() - begin.getY()) / (end.getX() - begin.getX());
    }

    // toString method
    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}
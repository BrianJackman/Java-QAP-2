/* 
Java QAP 2 
By: Brian Jackman
2024/10/08
 */

public class MyPoint {
    private int x;
    private int y;

    // Constructors
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
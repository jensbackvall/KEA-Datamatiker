
import java.io.*;
import java.util.*;

public class week14_594_1
{
    public static void main(String[] args)
    {
        Point p1 = new Point(4, 7);
        System.out.println(p1.quadrant());
    }
}

public class Point
{
    private int x;
    private int y;

    public Point()
    {
        this(0, 0);
    }

    public Point(int x, int y)
    {
        setLocation(x, y);
    }

    public double distanceFromOrigin()
    {
        return Math.sqrt(x * x + y * y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }

    public int quadrant() {
        if (x > 0 && y > 0)
        {
            return 1;
        } else if (x > 0 && y < 0)
        {
            return 2;
        } else if (x < 0 && y < 0)
        {
            return 3;
        } else if (x < 0 && y > 0)
        {
            return 4;
        } else
        {
            return 0;
        }
    }

}



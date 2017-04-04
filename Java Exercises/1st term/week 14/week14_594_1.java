import java.awt.*;

public class week14_594_1
{
    public static void main(String[] args)
    {
        Point(4, 7);
    }

    public Point(int initialX, int initialY)
    {
        int x = initialX;
        int y = initialY;
        Point p = new Point(x, y);
    }

    public int quadrant() {
        int quadResult;
        if (x > 0 && y > 0)
        {
            quadResult = 1;
        } else if (x > 0 && y < 0)
        {
            quadResult = 2;
        } else if (x < 0 && y < 0)
        {
            quadResult = 3;
        } else if (x < 0 && y > 0)
        {
            quadResult = 4;
        } else
        {
            quadResult = 0;
        }
    }
}
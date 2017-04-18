

public class PointMain
{
    public static void main(String[] args) {
        Point p1 = new Point(3, 2);
        Point p2 = new Point(4, 3);
        Point p3 = new Point(1, 2);
        Point p4 = new Point(1, -2);
        Point p5 = new Point(-1, -2);
        Point p6 = new Point(-1, 2);
        Point p7 = new Point(0, 0);
        Point p8 = new Point(-7, 21);
        Point p9 = new Point(5, 21);
        Point p10 = new Point(-6, 21);

        System.out.println("p1 is " + p1);
        System.out.println("distance from origin = " + p1.distanceFromOrigin());
        System.out.println("p2 is " + p2);
        System.out.println("distance from origin = " + p2.distanceFromOrigin());

        p1.translate(-11, 6);
        p2.translate(1, 7);

        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);

        System.out.println("p1 is in quadrant " + p1.quadrant());
        System.out.println("p3 is in quadrant " + p3.quadrant());
        System.out.println("p4 is in quadrant " + p4.quadrant());
        System.out.println("p5 is in quadrant " + p5.quadrant());
        System.out.println("p6 is in quadrant " + p6.quadrant());
        System.out.println("p7 is in quadrant " + p7.quadrant());

        System.out.println("p8 is " + p8);
        p8.flip();
        System.out.println("p8 has now been flipped and is " + p8);

        System.out.println("p1 is " + p1);
        System.out.println("p8 is " + p8);
        System.out.println("The Manhattan distance between p1 and p8 is " + p1.manhattanDistance(p8));
        System.out.println("p3 is " + p3);
        System.out.println("p7 is " + p7);
        System.out.println("The Manhattan distance between p3 and p7 is " + p3.manhattanDistance(p7));

        if (p9.isHorizontal(p10))
        {
            System.out.println("p9 and p10 ARE on the same horizontal axis");
        } else
        {
            System.out.println("p9 and p10 ARE NOT on the same horizontal axis");
        }

        if (p5.isHorizontal(p6))
        {
            System.out.println("p5 and p6 ARE on the same horizontal axis");
        } else
        {
            System.out.println("p5 and p6 ARE NOT on the same horizontal axis");
        }
    }
}
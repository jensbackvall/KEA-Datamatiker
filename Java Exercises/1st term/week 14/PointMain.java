

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

        // System.out.println("p1 is " + p1 + ", but now it has been flipped and is " + p1.flip());
    }
}
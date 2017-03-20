import ch.aplu.turtle.*;

public class Tu1
{
  Turtle joe = new Turtle();

  Tu1()
  {
    joe.forward(100);
    joe.right(90);
    joe.forward(100);
    joe.right(90);
    joe.forward(100);
    joe.right(90);
    joe.forward(100);
    joe.right(90);
  }

  public static void main(String[] args)
  {
    new Tu1();
  }
}
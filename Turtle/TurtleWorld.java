import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        turtle.forward(50);
        for(int i=0;i<10;i++){
        turtle.turn(0);
        turtle.setPenWidth(i);
        turtle.forward(50+5*i);
    }
}
}

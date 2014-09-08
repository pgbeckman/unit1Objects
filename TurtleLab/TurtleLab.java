import java.awt.Color;
import java.util.Random;

public class TurtleLab { 
    public static void main(String[] args) {
        World turtleWorld = new World(1000,1000); 
        Turtle turtle1 = new Turtle(turtleWorld);
        turtle1.penUp();
        turtle1.moveTo(200,200);
        turtle1.penDown();
        turtle1.setPenWidth(3);
        Random changer = new Random(); 
        int rememberColorR = 0;
        int rememberColorG = 0;
        int rememberColorB = 0;
        for(int i = 0; i < 700; i++) {  //Rainbow Squiggle Turtle
            int changeInt = changer.nextInt(7);
            Color assignColor = new Color(changer.nextInt(255),changer.nextInt(255),changer.nextInt(255));
            turtle1.setPenColor(assignColor);
            turtle1.turn(4*(changeInt-3)); 
            turtle1.forward(12*(changeInt-3));
        } 
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle2.penUp();
        turtle2.moveTo(800,800);
        turtle2.penDown();
        turtle2.setPenColor(Color.BLUE);
        turtle2.setPenWidth(3);
        for(int i = 4; i < 80; i++) { //Geometric Spiral Turtle
            turtle2.forward(20);
            turtle2.turn(360/i);
        }
        turtle2.setPenColor(Color.RED);
        for(int i = 4; i < 80; i++) { 
            turtle2.forward(20);
            turtle2.turn(-360/i);
        }
    } 
} 
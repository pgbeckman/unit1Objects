import java.util.Random;

public class randomness
{
    public static void main(String[] args)
    {
        Random bob = new Random();
        System.out.println(bob.nextInt(6)+1);
    }
}
        
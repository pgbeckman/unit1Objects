public class replace
{
   public static void main(String[] args)
   {
      String sentence1 = "      abc   ";
      String sentence2 = "   def";
      String sentence3 = "ghi         ";
      String message = sentence1+sentence2+sentence3;
      System.out.println(message.replace(" ",""));
   }
}
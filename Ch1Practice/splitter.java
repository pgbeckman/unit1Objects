
public class splitter
{
   public static void main(String[] args)
   {
       String hi="mississippi";
       String[] partsOfHi=hi.split("i");
       for(String i:partsOfHi){
           System.out.println(i);
       }
         
   }
}
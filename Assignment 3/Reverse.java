import java.util.Scanner;
public class Reverse
{
   private static String reversewords(String name)
   {
       String[] words= name.split("\\s");
       String reversestring="";
       for(int i=words.length-1;i>=0;i--)
       {
           reversestring=reversestring+words[i];
       }
       return reversestring;
   }
   public static void main(String args[])
   {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the first string");
       String name =scanner.nextLine();
       String reversestring=reversewords(name);
       System.out.println( reversestring);
   }
}
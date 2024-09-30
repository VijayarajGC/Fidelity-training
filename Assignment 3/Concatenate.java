import java.util.Scanner;

public class Concatenate
{
    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string");
        String name1= scanner.nextLine();
        System.out.println("Enter the second string");
        String name2= scanner.nextLine();
        String result = name1+" "+name2;
        System.out.println(result);

    }
}

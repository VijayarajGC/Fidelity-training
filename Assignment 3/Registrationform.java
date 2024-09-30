import java.util.Scanner;
public class Registrationform
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name= scanner.nextLine();
        System.out.println("Enter your age :");
        int age = scanner.nextInt();
        System.out.println("Enter your country :");
        String city= scanner.nextLine();
        System.out.println("Welcome" +name+  "Your age is "  +age+  "and you are from"+ city);

    }
}
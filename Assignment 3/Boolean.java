import java.util.Scanner;
public class Boolean
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int number2= scanner.nextInt();
        boolean answer = number1<number2;
        System.out.println("The result of  whether x is less than y" +answer);
    }
}

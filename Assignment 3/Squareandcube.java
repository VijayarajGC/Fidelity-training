import java.util.Scanner;
public class Squareandcube
{
    public static int findsquare(int number)
    {
        return number*number;
    }
    public static int findcube(int number)
    {
        return number*number*number;
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int squareresult= findsquare(number);
        int cuberesult=findcube(number);
        System.out.println(+squareresult);
        System.out.println(+cuberesult);
    }
}
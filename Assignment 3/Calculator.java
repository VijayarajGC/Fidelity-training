import java.util.Scanner;
public class Calculator
{
    public static void main(String args[])
    {
        char operator;
        int n1,n2,result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operator");
        operator = scanner.next().charAt(0);
        System.out.println("Enter the number1");
        n1 = scanner.nextInt();
        System.out.println("Enter the number2");
        n2= scanner.nextInt();
        switch(operator)
        {
            case '+':
            result=n1+n2;
            System.out.println(+result);
            break;

            case'-':
            result=n1-n2;
            System.out.println(+result);
            break;

            case'*':
                result=n1*n2;
                System.out.println(+result);
                break;

            case '/':
                result=n1/n2;
                System.out.println(+result);
                break;

            default:
                System.out.println("Invalid option");
                break;
        }

    }
}

import java.util.Scanner;

public class Insrancepay
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select insurance type:");
        System.out.println("1. Life Insurance");
        System.out.println("2. Motor Insurance");

        int choice = scanner.nextInt();

        if (choice == 1)
        {
            calculateLifeInsurance(scanner);
        }
        else if (choice == 2)
        {
            calculateMotorInsurance(scanner);
        }
        else
        {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static void calculateLifeInsurance(Scanner scanner)
    {
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("Enter your annual income:");
        double income = scanner.nextDouble();

        System.out.println("Enter desired coverage amount:");
        double coverage = scanner.nextDouble();
        double premium = (income * 0.01) + (age * 100);

        System.out.println("Your estimated life insurance premium: " + premium);
    }

    private static void calculateMotorInsurance(Scanner scanner)
    {
        System.out.println("Enter car value:");
        double carValue = scanner.nextDouble();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("Enter your driving experience (in years):");
        int experience = scanner.nextInt();
        double premium = (carValue * 0.05) - (experience * 50);

        System.out.println("Your estimated motor insurance premium: " + premium);
    }
}
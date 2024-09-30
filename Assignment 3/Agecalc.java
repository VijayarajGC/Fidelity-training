import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Agecalc
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name");
        String fname = scanner.nextLine();
        System.out.println("Enter the Last name");
        String lname = scanner.nextLine();
        System.out.println("Enter the year of birth");
        int year = scanner.nextInt();
        System.out.println("Enter the month of birth");
        int month= scanner.nextInt();
        System.out.println("Enter the day of birth");
        int day= scanner.nextInt();

        //current date
        LocalDate currentdate = LocalDate.now();
        // Birth date
        LocalDate birthdate = LocalDate.of(year,month,day);

        int age = Period.between(birthdate,currentdate).getYears();
        System.out.println("Age:"+age);
        if(age>=18)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("Child");
        }
    }
}

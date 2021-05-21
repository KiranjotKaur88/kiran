import java.util.Scanner;
public class SwitchCasePractice
{
    public static void main(String[] args)
    {
        System.out.println("Hello");
        Scanner ob2= new Scanner(System.in);
        int countryCode;
        System.out.println("Enter Country Code:\n");
        System.out.println("Hello");
        countryCode= ob2.nextInt();

        switch (countryCode) //allowed int, short , char, byte
        {
            case 91:
                System.out.println("Charges for India");
             break;
            case 44:
                System.out.println("Charges for USA");
                break;
            case 60:
                System.out.println("Charges for Australia");
                break;
            case 80:
                System.out.println("Charges for China");
                break;
            default:
                System.out.println("Invalid Country code");
        }
        boolean isWeekend=true;
        int weekend= isWeekend? 0:1;

    }
}

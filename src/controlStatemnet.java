
import java.util.Scanner;
public class controlStatemnet {
    public static void main(String[] args) {
        Scanner ob1=new Scanner(System.in);
        String countryCode;
        System.out.println("Enter Country Code:\n");
     countryCode=ob1.nextLine();


        if(countryCode.equals("IN")) {
            System.out.println("Country Name is India");

        }
        else if(countryCode.equals("USA"))
    {
        System.out.println("Country Name is United States");
        }
        else if(countryCode.equals("AUS"))
        {
            System.out.println("Country Name is Australia");
        }
        else {
            System.out.println("Contry invalid");
        }




    }

    private static void elseif() {
    }
}

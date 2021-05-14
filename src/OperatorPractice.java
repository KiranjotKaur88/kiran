import java.util.Scanner;
public class OperatorPractice {
    public static void main(String[] args) {
        int num1;
        int num2;
        int add,sub,mul,div,mod;
        int count=0; //increment and decrement operator
        Scanner ob1 =new Scanner(System.in);
        System.out.println("Enter the first number:\n");
        num1=ob1.nextInt();
        System.out.println("Enter Second number:\n");
        num2=ob1.nextInt();
        add=num1+num2;
        sub=num1-num2;
        mul=num1*num2;
        div=num1/num2;
        mod=num1%num2;
        /*System.out.println("Result of addition is:" +add +"\n")  ;
        System.out.println("Result of subtraction is:" +sub +"\n")  ;
        System.out.println("Result of multiplication is:" +mul +"\n")  ;
        System.out.println("Result of division is:" +div +"\n")  ;
        System.out.println("Result of modulus is:" +mod+"\n")  ; */
        //System.out.println(count++);
        //System.out.println(count--);
        System.out.println( 10==20 );
        System.out.println( num1!=num2 );
        System.out.println(num2>=num1);
        System.out.println(num1<=num2);
        System.out.println(num1>num2);
        System.out.println(num1>num2&&num2==40);
        System.out.println(20>30|| 40>30);
        System.out.println(!(20>30|| 40<30) );
        ob1.close();







    }
}

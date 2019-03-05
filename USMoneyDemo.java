import java.util.Scanner;

public class USMoneyDemo 
{
    
    public static void main(String[] args) 
    {

        int dollars, cents;

        Scanner keyScan = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter an integer representing dollars: ");
        dollars = keyScan.nextInt();

        System.out.print("Enter an integer representing cents: ");
        cents = keyScan.nextInt();

        USMoney x = new USMoney(cents, dollars);

        System.out.print("USMoney1: $" + x.getDollars() + "." + x.getCents() + "\n");


        // Get input from user
        System.out.print("\nEnter an integer representing dollars: ");
        dollars = keyScan.nextInt();

        System.out.print("Enter an integer representing cents: ");
        cents = keyScan.nextInt();

        USMoney y = new USMoney(cents, dollars);

        System.out.print("USMoney2: $" + y.getDollars() + "." + y.getCents() + "\n");

        System.out.print("\n");
        USMoney thing = x.plus(y);

        System.out.print("Result of plus: $" + thing.getDollars() + "." + thing.getCents() + "\n");

    }
}

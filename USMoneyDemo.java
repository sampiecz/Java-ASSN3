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

        System.out.print(x.getDollars());
        System.out.print(".");
        System.out.print(x.getCents());


        // Get input from user
        System.out.print("Enter an integer representing dollars: ");
        dollars = keyScan.nextInt();

        System.out.print("Enter an integer representing cents: ");
        cents = keyScan.nextInt();

        USMoney y = new USMoney(cents, dollars);

        System.out.print(y.getDollars());
        System.out.print(".");
        System.out.print(y.getCents());

        System.out.print("\n");
        USMoney thing = x.plus(y);

        System.out.print(thing.getDollars());
        System.out.print(".");
        System.out.print(thing.getCents());

    }
}

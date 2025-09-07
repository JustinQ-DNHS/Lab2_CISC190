import java.util.Scanner;
/**
 * Takes num of stocks cost of stocks in order to determine stock prices. Commission rate is a pre-determined variable.
 *
 * @author Justin Quach
 * @version v1.0
 * @since 9/6/25
 */
public class StockComission
{
    public static void main(String[] args)
    {
        final double commRate = 0.02;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of shares purchased: ");
        int numOfShares = input.nextInt();
        System.out.print("Enter price of shares: ");
        double costOfShares = input.nextDouble();
        System.out.printf("Total cost of shares are: $%.2f.\n" + 
                          "Comission cost is: $%.2f.\n" + 
                          "Total cost is $%.2f.", 
                          (numOfShares * costOfShares), 
                          (numOfShares * costOfShares * commRate), 
                          (numOfShares * costOfShares * (1 + commRate)));
    }
}
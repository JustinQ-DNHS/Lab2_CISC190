import java.util.Scanner;
/**
 * StockCommission does following
 * 1) Takes in number of shares purchased
 * 2) Takes in price per share
 * 3) Prints the total cost of all shares
 * 4) Prints the commission rate using the constant COMM_RATE defined
 * 5) Prints the total cost of all shares purchased along with commission rate
 *
 * @author Justin Quach
 * @version v1.0
 * @since 9/6/25
 */
public class StockComission
{
    public static void main(String[] args)
    {
        final double COMM_RATE = 0.02;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of shares purchased: ");
        int numOfShares = input.nextInt();
        System.out.print("Enter price per share: $");
        double costOfShares = input.nextDouble();
        // Not using multiple variables for each since it's one time use, I feel it's easier to just calculate it for each
        // in another system where I'd reuse the values I'd assign each value to a variable. 
        System.out.printf("\nTotal cost of shares are: $%,.2f.\n" + 
                          "Comission cost is: $%,.2f.\n" + 
                          "Total cost is $%,.2f.", 
                          (numOfShares * costOfShares), 
                          (numOfShares * costOfShares * COMM_RATE), 
                          (numOfShares * costOfShares * (1 + COMM_RATE)));
    }
}
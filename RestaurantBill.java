import java.util.Scanner;
/**
 * Calculate misc about restaurant bill.
 *
 * @author Justin Quach
 * @version v1.0
 * @since 9/6/25
 */
public class RestaurantBill
{
    public static void main(String[] args)
    {
        final double tax = 0.0675;
        final double tip = 0.2;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the cost of your bill?");
        try 
        {
            double basePrice = input.nextDouble();
            System.out.println("Meal charge: $" + basePrice + ".\n" +
                             "Tax amount: $" + (basePrice * tax) + ".\n" +
                             "Tip amount: $" + ((basePrice * (1 + tax)) * tip) + ".\n" + 
                             "Total cost: $" + (basePrice * (1 + tax) * (1 + tip)) + ".");
        }
        catch(Exception e) 
        {
            System.out.println("Please input a number");
        }
    }
}
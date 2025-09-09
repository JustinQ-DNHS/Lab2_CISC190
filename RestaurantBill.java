import java.util.Scanner;
/**
 * RestaurantBill process:
 * 1) Takes an input asking for meal amount
 * 2) Prints the tax cost using a predefined TAX constant
 * 3) Prints the tip cost using a predefined TIP constant
 * 4) Prints the total cost from meal, tax cost, and tip cost
 *
 * @author Justin Quach
 * @version v1.0
 * @since 9/6/25
 */
public class RestaurantBill
{
    public static void main(String[] args)
    {
        final double TAX = 0.0675;
        final double TIP = 0.2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter meal amount: ");
        double basePrice = input.nextDouble();
        // Was too lazy to add the tax and tip value to a var, so I just calculated in the equation.
        System.out.printf("\nThe tax is: $%,.2f\n" +
                           "The tip is: $%,.2f\n" + 
                           "The meal cost with tax and tip is: $%,.2f",
                           (basePrice * TAX), (basePrice * (1+TAX) * TIP), (basePrice * (1+TAX) * (1+TIP)));
    }
}
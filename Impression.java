
/**
 * Demonstrates imprecision error in math from coding.
 *
 * @author Justin Quach
 * @version 1.0
 * @since 9/5/25
 */
public class Impression
{
    public static void main(String[] args) 
    {
        double x, y, z;
        x = 12345.6789e200;
        y = 1 / x;
        z = x * y;
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The value of z is: " + z);
        System.out.println("The value of 1 - z is: " + (1 - z));
    }
}
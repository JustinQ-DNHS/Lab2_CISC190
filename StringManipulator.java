import java.util.Scanner;
/**
 * Takes city name and spits out 4 things about it.
 *
 * @author Justin Quach
 * @version v1.0
 * @since 9/6/25
 */
public class StringManipulator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your favorite city?");
        String city = input.nextLine();
        System.out.println("Num of char in city name: " + city.length() + ".\n" +
                           "City name in caps: " + city.toUpperCase() + ".\n" +
                           "City name in lowercase: " + city.toLowerCase() + ".\n" +
                           "First char in city name: " + city.charAt(0) + ".");
    }
}
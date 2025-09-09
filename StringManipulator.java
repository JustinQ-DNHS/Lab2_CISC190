import java.util.Scanner;
/**
 * Takes in a city name using the scanner object, then manipulates the city in order to display the city name's length, in upper case, in lower case
 * and the first character in its name.
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
        System.out.print("Enter a city: ");
        String city = input.nextLine();
        System.out.println("The city entered has: " + city.length() + " chars\n" +
                           "In upper case: " + city.toUpperCase() + "\n" +
                           "In lower case: " + city.toLowerCase() + "\n" +
                           "First character: " + city.charAt(0) + "");
    }
}
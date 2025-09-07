import java.util.Scanner;
/**
 * Asks for names and prints initials in response.
 *
 * @author Justin Quach
 * @version v1.0
 * @since 9/6/25
 */
public class NameAndInitials
{
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your first name? ");
        String firstName = input.nextLine();
        System.out.print("What's your middle name? ");
        String middleName = input.nextLine();
        System.out.print("What's your last name? ");
        String lastName = input.nextLine();
        System.out.println("Your first initial is " + firstName.charAt(0) + ".\n" + 
                           "Your middle initial is " + middleName.charAt(0) + ".\n" +
                           "Your last initial is " + lastName.charAt(0) + ".");
    }
}
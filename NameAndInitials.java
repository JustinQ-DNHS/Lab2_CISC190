import java.util.Scanner;
/**
 * Uses a scanner object in order to take the full name of the user and prints it back, along with their initials using the .charAt method.
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
        System.out.print("Enter your first name: ");
        String fName = input.nextLine();
        System.out.print("Enter your middle name: ");
        String mName = input.nextLine();
        System.out.print("Enter your last name: ");
        String lName = input.nextLine();
        System.out.println("\nMy name is: " + fName + " " + mName + " " + lName + "\n" +
                           "My initials are: " + fName.charAt(0) + mName.charAt(0) + lName.charAt(0));
    }
}
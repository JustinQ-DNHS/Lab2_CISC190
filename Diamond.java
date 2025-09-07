
/**
 * Creates a diamond with <n> rows.
 *
 * @author Justin Quach
 * @version v1.0
 * @since 9/5/25
 */
public class Diamond
{
    public static void main(String[] args)
    {
        makeDiamond(1);
    }
    public static void makeDiamond(int rows)
    {
        String spaces;
        String stars = "*";
        for (int i = (rows + 2) / 2; i > 0; i--)
        {
            spaces = " ".repeat(i);
            System.out.println(spaces + stars);
            stars += "**";
        }
        spaces = " ";
        for (int i = ((rows + 2) / 2) - 1; i > 0 / 2; i--)
        {
            spaces += " ";
            stars = "*".repeat((2 * i) - 1);
            System.out.println(spaces + stars);
        }
    }
}
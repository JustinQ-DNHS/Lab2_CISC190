
/**
 * Creates a diamond with <n> rows. This is done using a formula along with for loops.
 *
 * @author Justin Quach
 * @version v2.0
 * @since 9/5/25
 */
public class Diamond
{
    public static void main(String[] args)
    {
        // Calls the makeDiamond method in order to create a diamond with <n> rows
        makeDiamond(7);
    }
    private static void makeDiamond(int rows)
    {
        // Declaration of variables
        String spaces;
        // Diamonds with an even amount of rows require a different amount of starting stars in order to be symmetrical,
        // So I used a ternary operator in order to check whether rows was even
        String stars = rows % 2 == 0 ? "**" : "*";
        // For statement that uses a double instead of an integer, this is so that I don't have to write a seperate
        // for loop for even rows and odd rows. By including the 0.5 leftover from / 2 we can run one extra statement that adds the odd'th row
        // I also start i at the max amount of rows to make adding the spaces easier cause that's what I thought at the time
        for (double i = rows / 2d; i > 0; i--)
        {
            // Spaces are equal to the number of missing stars, and stars per row are equal to 2n - 1. Using that formula I determined that
            // number of spaces are equal to total rows - n. You have subtract 1 from even rows, not sure on math reason but I noticed the pattern
            // in debugging.
            spaces = " ".repeat(rows % 2 == 0 ? (int)i - 1: (int)i);
            // Concats the spaces and stars together then prints statement out
            System.out.println(spaces + stars);
            // Adds the two stars necessary for the next row (2n)
            stars += "**";
        }
        // Resets the spaces, similar to the way number of stars was set in the first half.
        // Is a ternary because evens, in order to be symmetrical, must start with 0 spaces meanwhile odds in order to be symmetrical must begin
        // with one space due to the center being on its own
        spaces = rows % 2 == 0 ? "" : " ";
        // For loop using an integer now because we don't want that extra row for odd numbers
        for (int i = rows / 2; i > 0; i--)
        {
            // Uses idea behind 2n + 1 = # of stars in order to do the math for how many stars should be in each row.
            // Different for evens and odds due to symmetrical issues. This might've been easier if i was incrementing to be honest.
            // I just wanted to copy paste the above part though
            stars = "*".repeat(rows % 2 == 0 ? 2*i : (2*i)-1);
            System.out.println(spaces + stars);
            // Number of spaces increases by 1 after each row, same for both even and odds.
            spaces += " ";
        }
    }
}
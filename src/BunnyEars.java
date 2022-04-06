public class BunnyEars
{
    public static void main(String[] args)
    {
        System.out.println(bunnyEars(10));
    }

    public static int bunnyEars(int bunnies)
    {
        if (bunnies > 5)
        {
            return 2 + bunnyEars(bunnies - 1);
        }
        else if (bunnies > 0)
        {
            return 3 + bunnyEars(bunnies - 2);
        }
        else
        {
            return 4;  // BASE CASE (doesn't involve a recursive call)
        }
    }
}


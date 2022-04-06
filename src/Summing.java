public class Summing
{
    public static void main(String [] args)
    {
        int someNum = mystery(9, 2);
        System.out.println(someNum);
    }

    public static int mystery(int m, int n)
    {
        if (m <= 0)
        {
            return n; // BASE CASE (doesn't involve a recursive call)
        }
        return n * mystery(m - 2, n + 1);
    }

}

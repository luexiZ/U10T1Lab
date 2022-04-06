public class StringFun
{
    public static void main(String [] args)
    {
        mystery("computers");
    }

    public static void mystery(String s)
    {
        if (s.length() > 1) // BASE CASE (recursive call only made when length > 1)
        {
            mystery(s.substring(2));
            System.out.print(s.substring(0, 1));
        }
    }
}

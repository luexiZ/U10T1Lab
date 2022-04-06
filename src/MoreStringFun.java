public class MoreStringFun
{
    public static void main(String [] args)
    {
        System.out.println(mysteryString("xyzxyyxy"));
    }

    public static int mysteryString(String str)
    {
        if (str.length() == 1) // BASE CASE
        {
            if (str.equals("y"))
            {
                return 2; // doesn't involve a recursive call
            }
            else
            {
                return 0; // doesn't involve a recursive call
            }
        }
        else
        {
            if (str.substring(0, 1).equals("y"))
            {
                return 2 + mysteryString(str.substring(1));
            }
            else
            {
                return mysteryString(str.substring(1));
            }
        }
    }
}

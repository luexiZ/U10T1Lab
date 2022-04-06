import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to start: ");
        String start = input.nextLine();
        strChange(start);
    }

//    public static String countdown(int number)
//    {
//        if(number == 1)
//        {
//            return "1 BlastOff!";
//        }
//
//        return "" + number + " " + countdown(number -1);
//    }

    public static void strChange(String str)

    {

        if (str.length() > 0)

        {

            strChange(str.substring(1));

            System.out.print(str.substring(0, 1));

        }

    }
}

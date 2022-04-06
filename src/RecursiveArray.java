public class RecursiveArray
{
    public static void main(String[] args)
    {
        int[] myNums = {6, 2, 8, 4, 7};
        int result = arrayRecursive(myNums, myNums.length - 1);
        System.out.println(result);
    }

    public static int arrayRecursive(int[] nums, int index)
    {
        if (index < 0)
        {
            return 0; // BASE CASE (doesn't involve a recursive call)
        }

        return nums[index] + arrayRecursive(nums, index - 1);
    }
}

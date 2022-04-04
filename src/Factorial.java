public class Factorial
{
	public static void main(String [] args)
	{
    System.out.println(factorialNonRecursive(5));
    System.out.println(factorialNonRecursive(10));
    
    System.out.println(factorialRecursive(5));
    System.out.println(factorialRecursive(10));
	}
  
  public static int factorialNonRecursive(int num)
  {
    int factorial = 1;
    for (int i = num; i >= 1; i--)
    {
      factorial *= i;
    }
    return factorial;
  }
  
  public static int factorialRecursive(int num)
  {
    if (num == 1)
    {
      return 1;
    }
    else
    {
      return (num * factorialRecursive(num - 1));
    }
  }
}
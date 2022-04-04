public class RecursionThatEnds
{
  public static void main(String [] args)
  {
    recursiveMethod(2);
	}
  
  public static void recursiveMethod(int n)
  {
    System.out.println("Called, n = " + n);
    if (n < 4)
    {
      recursiveMethod(n + 1);
    }
    System.out.println("Ended, n = " + n);
  }
}


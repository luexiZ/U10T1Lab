public class InfiniteRecursion
{
	public static void main(String [] args)
	{
    System.out.println("main method called");
    recursiveMethod();
    System.out.println("main method ended");
	}
  
  public static void recursiveMethod()
  {
    System.out.println("recursiveMethod called");
    recursiveMethod(); // method calls itself!
    System.out.println("recursiveMethod ended");
  }
}

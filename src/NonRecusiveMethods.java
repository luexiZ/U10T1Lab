public class NonRecusiveMethods
{
	public static void main(String [] args)
	{
    System.out.println("main method called");
    methodOne();
    System.out.println("main method ended");
	}
  
  public static void methodOne()
  {
    System.out.println("methodOne called");
    methodTwo();
    System.out.println("methodOne ended");
  }
  
  public static void methodTwo()
  {
    System.out.println("methodTwo called");
    methodThree();
    System.out.println("methodTwo ended");
  }
  
  public static void methodThree()
  {
    System.out.println("methodThree called");
    System.out.println("methodThree ended");
  }
}

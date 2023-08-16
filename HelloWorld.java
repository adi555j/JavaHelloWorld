public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello world!");
	wait(5000);
	System.out.println("Hello world again!");
	wait(50000);
	System.out.println("Hello world again and again!");
	wait(5000000);
	System.out.println("Hello world again and again after 500000ms!");
	
  }
  public static void wait(int ms)
  {
	  try
	  {
		  Thread.sleep(ms);
	  }
	  catch(InterruptedException ex)
	  {
		  Thread.currentThread().interrupt();
	  }
  }
}

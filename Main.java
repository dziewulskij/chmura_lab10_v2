import java.lang.*;

public class Main{
	public static void main(String[] args){
		while(true){
			System.out.println("Kontener w wersji 2");
			wait(3000);
		}
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

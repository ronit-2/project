
 // Run-Time Polymorphism
 
class SportSwim
{
	public void swimming ()
	{
			System.out.println("Swimming!"); 
	}
}
public class Swim extends SportSwim
{
	public void swimming ()
	{
			System.out.println("Sucessfully swam 3 laps!");
	}
	
	public static void main (String [] args)
	{
			SportSwim s = new Swim();
			s.swimming();
	}
}

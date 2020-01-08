
// Encapsulation

public class RunEncap 
{
	public static void main (String [] args)
	{
		GetEncap ge = new GetEncap();
		ge.setName("Mark");
		ge.setBirthplace("Phiadelphia");
		ge.setAge(26);
		System.out.println("\nName: " + ge.getName() + "\nBirthplace: " + ge.getBirthplace() + "\nAge: " + ge.getAge() + "\n" ); 
	}
}


// Inheritance

import java.lang.Math;
class SuperMath {
   int num = 435;

   public void display() 
   {
      System.out.println("My new number is: " + num);
   }
}

public class SubMath extends SuperMath {
  int num = 228;

   public void display() {
      System.out.println("\nMy number is: " + num);
   }

   public void action() {
      SubMath sm = new SubMath();
      sm.display();
      super.display();

      System.out.println("My number in the sub class was "+ sm.num + ".");
      System.out.println("My new number in the super cass is " + super.num +".\n");
   }

   public static void main(String [] args) {
      SubMath s2 = new SubMath();
      s2.action();	
	}
}

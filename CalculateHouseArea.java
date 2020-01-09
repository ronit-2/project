
// Compile-Time Polymorphism

class HouseArea 
{ 
   
    static int Measurements (int length, int width) 
    { 
        return length * width; 
    } 
  
    static double Measurements (double length, double width) 
    { 
        return length * width; 
    } 
} 
  
class CalculateHouseArea 
{ 

    public static void main(String[] args) 
    { 
		
        System.out.println("\nThe House Area is " + HouseArea.Measurements (25, 47) + " feet."); 
        System.out.println("\nThe Garage Area is " + HouseArea.Measurements (13.5, 24.5) + " feet.\n"); 
    } 
} 

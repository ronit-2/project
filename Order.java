
// Abstraction

abstract class Delivery {

  public abstract void parcelDetails();

  public void eta() {
	  
    System.out.println("\nYour parcel will arrive on January 23, 2020.");
  }
}

class Box extends Delivery {
	
  public void parcelDetails() {

    System.out.println("Parcel is being delivered to 671 Lincoln Avenue, Winnetka, IL.\n");
    
  }
  
}

class Order {
	
  public static void main(String[] args) {
	  
    Box myOrder = new Box(); 
    
    myOrder.eta();
    
    myOrder.parcelDetails();
    
  }
}

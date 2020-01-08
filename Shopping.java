
// Compile-Time Polymorphism

class Register
{
    public void cost (int price)
    {
       System.out.println ("\nCurrent Price: " + price);
    }
    public void tax (int price, int tax)
    {
       System.out.println ("Current Cost with Tax: " + price + "," + tax);
    }
    public double SmallerPrice (double sprice) {
       System.out.println("Your Price divided by itself: " + sprice);
       return sprice*sprice;
    }
}
class Shopping
{
    public static void main (String args [])
    {
        Register r = new Register();
        double total;
        r.cost(25);
        r.tax(25,49);
        total = r.SmallerPrice(7.0);
        System.out.println("Your total is: " + total + "\n");
    }
}

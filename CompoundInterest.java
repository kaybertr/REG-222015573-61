public class CompoundInterest {

  public static void main(String[] args) {

    // Create loan with 500000 principal, 18% rate  
    Loan loan = new Loan(500000, 18);
    
    // Calculate total amount after 3 years
    double total = loan.calculateTotalAmount(3);  
    
    // Print total amount
    System.out.println("The total amount paid after 3 years is: " + total);
  } 
}

// Loan class
class Loan {

  double principal;
  double rate;
  
  // Constructor to initialize values
  public Loan(double p, double r) {
    principal = p;
    rate = r/100; 
  }

  // Calculate total amount with compound interest  
  public double calculateTotalAmount(int years) {
    
    // Calculate compound interest 
    double total = principal * Math.pow(1 + rate/12, years*12);
    
    return total;
  }

}

public class SimpleInterest {

  public static void main(String[] args) {
  
    // Create a BankAccount with 100000 principal
    BankAccount account = new BankAccount(100000);  

    // Calculate interest for 5 years at 5% rate
    double interest = account.calculateInterest(5, 5);
    
    // Print the simple interest earned
    System.out.println("The simple interest earned is: " + interest);
  }
}

// BankAccount class 
class BankAccount {

  double principal;
  
  // Constructor to initialize principal
  public BankAccount(double p) {
    principal = p; 
  }

  // Method to calculate simple interest
  public double calculateInterest(int years, double rate) {
    return principal * years * rate / 100;
  }

}

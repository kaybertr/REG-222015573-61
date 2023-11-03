public class SimpleInterest {

  public static void main(String[] args) {
    
    BankAccount account = new BankAccount(100000);
    double interest = account.calculateInterest(5, 5);
    
    System.out.println("The simple interest earned is: " + interest);
  }

}

class BankAccount {

  double principal;

  public BankAccount(double p) {
    principal = p;
  }

  public double calculateInterest(int years, double rate) {
    return principal * years * rate / 100;
  }

}
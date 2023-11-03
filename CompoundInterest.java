public class CompoundInterest {

  public static void main(String[] args) {

    Loan loan = new Loan(500000, 18); 
    double total = loan.calculateTotalAmount(3);

    System.out.println("The total amount paid after 3 years is: " + total);

  }

}

class Loan {

  double principal;
  double rate;

  public Loan(double p, double r) {
    principal = p;
    rate = r/100; 
  }

  public double calculateTotalAmount(int years) {
    double total = principal * Math.pow(1 + rate/12, years*12);
    return total;
  }

}
class CompoundInterest {
    double principal;
     double rate;
     double time;

    public CompoundInterest(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double calculate() {
         
        return principal * Math.pow((1 + rate / 100), time);
    }

    public static void main(String[] args) {
        CompoundInterest compoundInterest = new CompoundInterest(500000, 18, 3*12);

        double CI = compoundInterest.calculate();

    
        System.out.println("Compound interest for Mr. Bob: " + CI);
    }
}
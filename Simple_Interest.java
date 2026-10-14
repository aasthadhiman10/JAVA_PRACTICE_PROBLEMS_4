class SimpleInterest {
double principal, rate, time;
static String bank = "ABC Bank";
SimpleInterest(double p, double r, double t) {
    principal = p;
    rate = r;
    time = t;
}

void calculate() {
    double interest = (principal * rate * time) / 100;

    System.out.println("Bank: " + bank);
    System.out.println("Principal: " + principal);
    System.out.println("Rate: " + rate + "%");
    System.out.println("Time: " + time + " years");
    System.out.println("Simple Interest: " + interest);
}

public static void main(String[] args) {
    SimpleInterest s = new SimpleInterest(10000, 5, 2);
    s.calculate();
  }

}

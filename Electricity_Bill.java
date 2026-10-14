class ElectricBill {
int units;
static double fixedCharge = 50;
ElectricBill(int u) {
    units = u;
}

void calculateBill() {
    double rate = 5.0;
    double energyCharge = units * rate;
    double totalBill = energyCharge + fixedCharge;

    System.out.println("Units Consumed: " + units);
    System.out.println("Rate per Unit: " + rate);
    System.out.println("Energy Charge: " + energyCharge);
    System.out.println("Fixed Charge: " + fixedCharge);
    System.out.println("Total Bill: " + totalBill);
}

public static void main(String[] args) {
    ElectricBill e = new ElectricBill(100);
    e.calculateBill();
   }
}

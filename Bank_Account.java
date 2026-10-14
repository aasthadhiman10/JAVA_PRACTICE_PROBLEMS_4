class BankAccount {
long accountNumber;
double balance;
static String bankName = "State Bank of India";
BankAccount(long number, double amount) {
    accountNumber = number;
    balance = amount;
}

void deposit(double amount) {
    double depositAmount = amount;
    double newBalance = balance + depositAmount;
    balance = newBalance;
}

void display() {
    System.out.println("Bank: " + bankName);
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Balance: " + balance);
}

public static void main(String[] args) {
    BankAccount b = new BankAccount(123456789, 5000);
    b.deposit(2000);
    b.display();
  }
}

class BankAccount {
double balance;
static String bankCode = "SBI001";
BankAccount(double b) {
    balance = b;
}

void withdraw(double amount) {
    double withdrawalAmount = amount;

    if (withdrawalAmount <= 0) {
        System.out.println("Invalid withdrawal amount");
    } else if (withdrawalAmount <= balance) {
        balance = balance - withdrawalAmount;
        System.out.println("Withdrawal Successful");
        System.out.println("Withdrawn Amount: " + withdrawalAmount);
        System.out.println("Remaining Balance: " + balance);
    } else {
        System.out.println("Insufficient Balance");
    }
}

public static void main(String[] args) {
    BankAccount b = new BankAccount(5000);

    System.out.println("Bank Code: " + bankCode);
    b.withdraw(1500);
  }
}

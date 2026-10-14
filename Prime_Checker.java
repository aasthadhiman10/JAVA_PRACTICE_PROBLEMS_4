class PrimeChecker {
static int totalPrimeChecks = 0;
void checkPrime(int number) {
    totalPrimeChecks++;

    boolean isPrime = true;

    if (number <= 1) {
        isPrime = false;
    } else {
        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
    }

    if (isPrime) {
        System.out.println(number + " is a Prime Number");
    } else {
        System.out.println(number + " is not a Prime Number");
    }
}

public static void main(String[] args) {
    PrimeChecker p = new PrimeChecker();

    p.checkPrime(7);
    p.checkPrime(10);

    System.out.println("Total Prime Checks: " + totalPrimeChecks);
 }
}

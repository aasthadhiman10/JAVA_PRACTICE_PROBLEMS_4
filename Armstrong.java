class Armstrong {
static int totalChecks = 0;
void check(int number) {
    totalChecks++;

    int original = number;
    int temp = number;
    int digits = 0;
    int sum = 0;

    if (number < 0) {
        System.out.println(original + " is not an Armstrong Number");
        return;
    }

    do {
        digits++;
        temp = temp / 10;
    } while (temp != 0);

    temp = number;

    while (temp > 0) {
        int digit = temp % 10;
        int power = 1;

        for (int i = 1; i <= digits; i++) {
            power = power * digit;
        }

        sum = sum + power;
        temp = temp / 10;
    }

    if (sum == original) {
        System.out.println(original + " is an Armstrong Number");
    } else {
        System.out.println(original + " is not an Armstrong Number");
    }
}

public static void main(String[] args) {
    Armstrong a = new Armstrong();

    a.check(153);
    a.check(123);

    System.out.println("Total Checks: " + totalChecks);
  }
}

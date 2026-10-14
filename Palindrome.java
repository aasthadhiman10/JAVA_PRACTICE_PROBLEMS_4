class Palindrome {
static int countChecks = 0;
void check(int number) {
    countChecks++;

    int original = number;
    int reverse = 0;
    int digit;

    while (number > 0) {
        digit = number % 10;
        reverse = reverse * 10 + digit;
        number = number / 10;
    }

    if (original >= 0 && original == reverse) {
        System.out.println(original + " is a Palindrome");
    } else {
        System.out.println(original + " is not a Palindrome");
    }
}

public static void main(String[] args) {
    Palindrome p = new Palindrome();

    p.check(121);
    p.check(123);

    System.out.println("Total Checks: " + countChecks);
  }

}

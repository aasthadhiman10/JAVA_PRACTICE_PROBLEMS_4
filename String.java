class StringReverse {
static int totalReversals = 0;
void reverse(String text) {
    totalReversals++;

    String reversed = "";

    for (int i = text.length() - 1; i >= 0; i--) {
        reversed = reversed + text.charAt(i);
    }

    System.out.println("Original String: " + text);
    System.out.println("Reversed String: " + reversed);
}

public static void main(String[] args) {
    StringReverse s = new StringReverse();

    s.reverse("Java");
    s.reverse("Hello");

    System.out.println("Total Reversals: " + totalReversals);
 }
}

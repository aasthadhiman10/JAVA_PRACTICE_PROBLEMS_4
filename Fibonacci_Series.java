class Fibonacci {
static int seriesCount = 0;
void displaySeries(int n) {
    seriesCount++;

    int first = 0;
    int second = 1;

    if (n <= 0) {
        System.out.println("Enter a positive number");
        return;
    }

    System.out.print("Fibonacci Series: ");

    for (int i = 1; i <= n; i++) {
        System.out.print(first + " ");

        int next = first + second;
        first = second;
        second = next;
    }

    System.out.println();
}

public static void main(String[] args) {
    Fibonacci f = new Fibonacci();

    f.displaySeries(7);

    System.out.println("Total Series Generated: " + seriesCount);
  }
}

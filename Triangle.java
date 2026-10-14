class Triangle {
int a, b, c;
static String type = "Scalene/Isosceles/Equilateral";
Triangle(int x, int y, int z) {
    a = x;
    b = y;
    c = z;
}

void checkTriangle() {
    boolean valid = a + b > c && a + c > b && b + c > a;

    System.out.println("Triangle Type Options: " + type);

    if (!valid) {
        System.out.println("Invalid Triangle");
    } else {
        String triangleType;

        if (a == b && b == c) {
            triangleType = "Equilateral";
        } else if (a == b || b == c || a == c) {
            triangleType = "Isosceles";
        } else {
            triangleType = "Scalene";
        }

        System.out.println("Valid Triangle");
        System.out.println("Type: " + triangleType);
    }
}

public static void main(String[] args) {
    Triangle t = new Triangle(5, 5, 5);
    t.checkTriangle();
  }

}

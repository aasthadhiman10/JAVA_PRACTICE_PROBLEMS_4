class Rectangle {
double length;
double breadth;
static String shapeName = "Rectangle";
Rectangle(double l, double b) {
    length = l;
    breadth = b;
}

void displayArea() {
    double area = length * breadth;
    System.out.println("Shape: " + shapeName);
    System.out.println("Length: " + length);
    System.out.println("Breadth: " + breadth);
    System.out.println("Area: " + area);
}

public static void main(String[] args) {
    Rectangle r = new Rectangle(10, 5);
    r.displayArea();
  }

}

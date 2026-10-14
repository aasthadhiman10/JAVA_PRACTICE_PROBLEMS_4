class Product {
int id;
String name;
double price;
static double discountRate = 10;
Product(int i, String n, double p) {
    id = i;
    name = n;
    price = p;
}

void display() {
    double discount = price * discountRate / 100;
    double finalPrice = price - discount;

    System.out.println("Product ID: " + id);
    System.out.println("Product Name: " + name);
    System.out.println("Original Price: " + price);
    System.out.println("Discount: " + discount + "%");
    System.out.println("Final Price: " + finalPrice);
}

public static void main(String[] args) {
    Product p = new Product(101, "Keyboard", 1000);
    p.display();
  }
}

class Laptop {
String brand;
int RAM;
static String os = "Windows";
Laptop(String b, int r) {
    brand = b;
    RAM = r;
}

void display() {
    String laptopBrand = brand;
    int laptopRAM = RAM;

    System.out.println("Brand: " + laptopBrand);
    System.out.println("RAM: " + laptopRAM + " GB");
    System.out.println("Operating System: " + os);
}

public static void main(String[] args) {
    Laptop l = new Laptop("HP", 8);
    l.display();
  }

}

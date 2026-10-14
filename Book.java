class Book {
String title;
String author;
double price;
static String publisher = "Pearson";
Book(String t, String a, double p) {
    title = t;
    author = a;
    price = p;
}

void display() {
    String bookTitle = title;
    String bookAuthor = author;
    double bookPrice = price;

    System.out.println("Title: " + bookTitle);
    System.out.println("Author: " + bookAuthor);
    System.out.println("Price: " + bookPrice);
    System.out.println("Publisher: " + publisher);
}

public static void main(String[] args) {
    Book b = new Book("Java Programming", "James Gosling", 450);
    b.display();
  }

}

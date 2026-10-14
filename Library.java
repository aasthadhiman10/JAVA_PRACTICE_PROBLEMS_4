class Library {
int booksAvailable;
static String libraryName = "Central Library";
Library(int books) {
    booksAvailable = books;
}

void updateBooks(int booksAdded, int booksIssued) {
    int availableBooks = booksAvailable;
    int updatedBooks = availableBooks + booksAdded - booksIssued;

    if (updatedBooks >= 0) {
        booksAvailable = updatedBooks;
        System.out.println("Library Name: " + libraryName);
        System.out.println("Books Added: " + booksAdded);
        System.out.println("Books Issued: " + booksIssued);
        System.out.println("Updated Books Available: " + booksAvailable);
    } else {
        System.out.println("Error: Not enough books available.");
    }
}

public static void main(String[] args) {
    Library l = new Library(100);

    System.out.println("Initial Books Available: " + l.booksAvailable);

    l.updateBooks(20, 10);
 }

}

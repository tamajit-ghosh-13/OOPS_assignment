package root;

class Book {
    String title, publisher, isbn;
    String[] authors;
    int pages; float price;

    Book(String t, String[] a, int p, float pr, String pub, String i) {
        title = t; authors = a; pages = p; price = pr; publisher = pub; isbn = i;
    }
}

class Library {
    Book[] books = new Book[100];
    int count = 0;

    void add(Book b) { books[count++] = b; }
    
    void printLibraryStats() {
        float total = 0;
        for (int i = 0; i < count; i++) {
            total += books[i].price;
            System.out.println("Book: " + books[i].title + " | ISBN: " + books[i].isbn);
        }
        System.out.println("Total Price of all books: " + total);
    }
}

public class ass16 {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.add(new Book("Java Basics", new String[]{"Author A"}, 400, 500.0f, "Pub X", "ISBN001"));
        lib.add(new Book("OOP Guide", new String[]{"Author B"}, 350, 450.0f, "Pub Y", "ISBN002"));
        lib.printLibraryStats();
    }
}

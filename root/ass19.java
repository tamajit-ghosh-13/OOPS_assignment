package root;

abstract class Publication {
    int noOfPages; float price; String publisherName;
    Publication(int p, float pr, String pub) { noOfPages = p; price = pr; publisherName = pub; }
    abstract void display();
}

class Book extends Publication {
    Book(int p, float pr, String pub) { super(p, pr, pub); }
    void display() { System.out.println("Book: " + publisherName + " | Price: " + price); }
}

class Journal extends Publication {
    Journal(int p, float pr, String pub) { super(p, pr, pub); }
    void display() { System.out.println("Journal: " + publisherName + " | Price: " + price); }
}

public class ass19 {
    public static void main(String[] args) {
        Publication[] list = { new Book(300, 500, "Oxford"), new Journal(50, 150, "Nature") };
        for (Publication p : list) p.display();
    }
}

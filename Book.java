public class Book {
    String title;
    int pages;

    Book() {
        title = "Java Basics";
        pages = 250;
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Pages: " + pages);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();
    }
}

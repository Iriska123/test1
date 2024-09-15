public class Book extends LibraryItem {

    private String title;

    public Book(String inventoryNumber, String author, String title) {
        super(inventoryNumber, author);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book - " + super.toString() + ", Title: " + title;
    }
}

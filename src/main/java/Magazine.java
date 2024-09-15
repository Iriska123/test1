public class Magazine extends LibraryItem {

    private String title;

    public Magazine(String inventoryNumber, String author, String title) {
        super(inventoryNumber, author);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Magazine - " + super.toString() + ", Title: " + title;
    }
}

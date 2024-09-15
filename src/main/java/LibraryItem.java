public class LibraryItem {
    private String inventoryNumber;
    private String author;

    public LibraryItem(String inventoryNumber, String author) {
        this.inventoryNumber = inventoryNumber;
        this.author = author;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Inventory Number: " + inventoryNumber + ", Author: " + author;
    }
}

public class Microfilm extends LibraryItem {
    private String description;

    public Microfilm(String inventoryNumber, String author, String description) {
        super(inventoryNumber, author);
        this.description = description;
    }

    @Override
    public String toString() {
        return "Microfilm - " + super.toString() + ", Description: " + description;
    }
}

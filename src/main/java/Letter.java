public class Letter extends LibraryItem {
    private String recipient;

    public Letter(String inventoryNumber, String author, String recipient) {
        super(inventoryNumber, author);
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "Letter - " + super.toString() + ", Recipient: " + recipient;
    }
}

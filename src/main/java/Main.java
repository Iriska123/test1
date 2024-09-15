import java.util.List;

public class Main {

    public static void main(String[] args) {
        LibraryRegistry registry = new LibraryRegistry();

        registry.addItem(new Book("001", "Author A", "Java Programming"));
        registry.addItem(new Magazine("002", "Author B", "Tech Monthly"));
        registry.addItem(new Letter("003", "Author C", "Recipient X"));
        registry.addItem(new Microfilm("004", "Author D", "Historical Document"));

        SearchService searchService = new SearchService(registry);

        List<LibraryItem> foundByInventory = searchService.searchByInventoryNumber("001");
        System.out.println("Found by Inventory Number:");
        foundByInventory.forEach(System.out::println);

        List<LibraryItem> foundByAuthor = searchService.searchByAuthor("Author A");
        System.out.println("\nFound by Author:");
        foundByAuthor.forEach(System.out::println);
    }
}

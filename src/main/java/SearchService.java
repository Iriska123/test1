import java.util.List;
import java.util.stream.Collectors;
public class SearchService {
    private LibraryRegistry registry;

    public SearchService(LibraryRegistry registry) {
        this.registry = registry;
    }

    public List<LibraryItem> searchByInventoryNumber(String inventoryNumber) {
        return registry.getItems().stream()
                .filter(item -> item.getInventoryNumber().equalsIgnoreCase(inventoryNumber))
                .collect(Collectors.toList());
    }

    public List<LibraryItem> searchByAuthor(String author) {
        return registry.getItems().stream()
                .filter(item -> item.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }
}

import java.util.ArrayList;
import java.util.List;
public class LibraryRegistry {
    private List<LibraryItem> items;

    public LibraryRegistry() {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public List<LibraryItem> getItems() {
        return items;
    }
}

import java.util.ArrayList;
import java.util.List;

public class DatabaseSingleton {
    private static DatabaseSingleton instance;
    private List<String> data;

    private DatabaseSingleton() {
        data = new ArrayList<>();
    }

    public static DatabaseSingleton getInstance() {
        if (instance == null) {
            instance = new DatabaseSingleton();
        }
        return instance;
    }

    public void create(String item) {
        data.add(item);
    }

    public List<String> read() {
        return new ArrayList<>(data);
    }

    public void update(int index, String newItem) {
        if (index >= 0 && index < data.size()) {
            data.set(index, newItem);
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < data.size()) {
            data.remove(index);
        }
    }
}

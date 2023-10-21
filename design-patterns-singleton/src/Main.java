import java.util.List;

public class Main {
    public static void main(String[] args) {
        DatabaseSingleton database = DatabaseSingleton.getInstance();

        database.create("Item 1");
        database.create("Item 2");
        database.create("Item 3");

        System.out.println("Itens no banco de dados:");
        List<String> items = database.read();
        for (String item : items) {
            System.out.println(item);
        }

        database.update(1, "Item 2 (atualizado)");

        System.out.println("\nItens atualizados no banco de dados:");
        items = database.read();
        for (String item : items) {
            System.out.println(item);
        }

        database.delete(0);

        System.out.println("\nItens após a exclusão:");
        items = database.read();
        for (String item : items) {
            System.out.println(item);
        }
    }
}

class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Database connected.");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }
}

public class SingletonPatternDemo {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.executeQuery("SELECT * FROM users");

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.executeQuery("UPDATE users SET name = 'John Doe'");
    }
}

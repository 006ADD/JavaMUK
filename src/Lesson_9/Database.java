package Lesson_9;

public interface Database {
    void connect(String databaseName, String username, String password);
    void select(String query);
    void close();
}

package Lesson_9;

public class MySQL implements Database{
    private String dataBaseName;
    private String userName;
    private String password;
    private boolean isConnected;

    public MySQL() {
        isConnected = false;
    }

    @Override
    public void connect(String dataBaseName, String userName, String password) {
        if (!isConnected) {
            this.dataBaseName = dataBaseName;
            this.userName = userName;
            this.password = password;
            System.out.println("Connected to MySQL database: " + dataBaseName);
            isConnected = true;
        } else {
            System.out.println("Already connected to MySQL database: " + dataBaseName);
        }
    }

    @Override
    public void select(String query) {//запрос
        if (isConnected) {
            System.out.println("Executing MySQL query: " + query);
        } else {
            System.out.println("Not connected to the database.");
        }
    }

    @Override
    public void close() {
        if (isConnected) {
            System.out.println("Closing MySQL database connection: " + dataBaseName);
            isConnected = false;
        } else {
            System.out.println("Not connected to any database.");
        }
    }
}
package Lesson_9;

public class Oracle implements Database{
    private String dataBaseName;
    private String userName;
    private String password;
    private boolean isConnected;

    public Oracle() {
        isConnected = false;
    }

    @Override
    public void connect(String dataBaseName, String userName, String password) {
        if (!isConnected) {
            this.dataBaseName = dataBaseName;
            this.userName = userName;
            this.password = password;
            System.out.println("Connected to Oracle database: " + dataBaseName);
            isConnected = true;
        } else {
            System.out.println("Already connected to Oracle database: " + dataBaseName);
        }
    }

    @Override
    public void select(String query) {
        if (isConnected) {
            System.out.println("Executing Oracle query: " + query);
        } else {
            System.out.println("Not connected to any database.");
        }
    }

    @Override
    public void close() {
        if (isConnected) {
            System.out.println("Closing Oracle database connection: " + dataBaseName);
            isConnected = false;
        } else {
            System.out.println("Not connected to the database.");
        }
    }
}

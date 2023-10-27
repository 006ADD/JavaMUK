package Lesson_9;
/**Задания
 1. Создать интерфейс Database. Интерфейс содержит следующие методы:
 - connect: соединение с базой данных.
 - select: выборка каких-либо данных.
 - close: закрытие соединения с базой данных.
 Вызов методов должен быть последовательный. Например, нельзя сделать выборку и закрытие, если соединение не открыто.
 При вызове методов на экран должно выводиться соответствующее сообщение.
 2. Создать два класса MySQL и Oracle, которые реализуют интерфейс Database.
 3. Привести пример использования интерфейса и классов. */
public class Solution9 {
    public static void main(String[] args) {
        MySQL mysqlDB = new MySQL();
        Oracle oracleDB = new Oracle();

        mysqlDB.connect("MySQLDatabase", "MySQLuser", "MySQLpassword");
        mysqlDB.select("SELECT * FROM table1");
        mysqlDB.close();

        oracleDB.connect("OracleDatabase", "Oracleuser", "Oraclepassword");
        oracleDB.select("SELECT * FROM table2");
        oracleDB.close();
    }
}


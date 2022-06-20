/*
package com.example.projectfx;


public class TestConnection {
    public static final String USER_NAME = "postgres";
    public static final String PASSWORD = "1111";
    public static final String URL = "jdbc:postgresql://localhost:5432/FlowerShop";
    public static Statement statement;
    public static Connection connection;

    public Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            //System.out.println("dfsjhxrfdtgyktygukyfu");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            statement = connection.createStatement();
            //System.out.println("dfsjhxrfdtgyktygukyfu");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
        return connection;
    }

}
*/

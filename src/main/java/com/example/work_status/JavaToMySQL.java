package com.example.work_status;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Simple Java program to connect to MySQL database running on localhost and
 * running SELECT and INSERT query to retrieve and add data.
 * @author Javin Paul
 */
public class JavaToMySQL {

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/store";
    private static final String user = "root";
    private static final String password = "TestTest";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

// executing SELECT query
   // rs = stmt.executeQuery(query);
        String query = "select Name, Age from employees";

        JavaToMySQL() {
            try {
                // opening database connection to MySQL server
                con = DriverManager.getConnection(url, user, password);

                // getting Statement object to execute query
                stmt = con.createStatement();


                while (rs.next()) {
                    int age = rs.getInt(2);
                    String name = rs.getString(1);
                    System.out.println(name + " " + age);
                }

            } catch (SQLException sqlEx) {
                sqlEx.printStackTrace();
            } finally {
                //close connection ,stmt and resultset here
                try {
                    con.close();
                } catch (SQLException se) { /*can't do anything */ }
                try {
                    stmt.close();
                } catch (SQLException se) { /*can't do anything */ }

            }
        }
        public void addUser(String userName, int age, String status) throws SQLException {
            stmt.executeUpdate("INSERT INTO store.employees (Name, Age, Work_status) \n"+
                   " VALUES (" + "'" + userName + "' ," + age + "," + "'" + status + "');");
        }
        public void getUsers(String orderBy) throws SQLException{
            rs = stmt.executeQuery("SELECT * FROM employees ORDER BY " + orderBy);
            rs.close();
        }

}
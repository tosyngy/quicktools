/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author Oginni
 */
import java.sql.*;

public class Sqlite {

    Connection c;
    Statement stmt;
    PreparedStatement ps;
    ResultSet rs;

    public Sqlite() {
        // createTable();
//        dbData a[] = new dbData[1];
//        a[0] = new dbData("ID", "2");
//        a[0] = new dbData("address", "Los Angeles");
//        a[2] = new dbData("AGE", "23");
//        a[3] = new dbData("ADDRESS", "Los Angelise");
//        a[4] = new dbData("SALARY", "10000.00");
//
//
//        insertItemOnly(a, "COMPANY");
//        insertItem();
//        updateItem(a, "COMPANY", "id=2");
 //       selectItem();
 //       deleteItem("COMPANY","id=2");
    }

    public static void main(String[] args) {
        new Sqlite();
    }

    public void createTable() {
        connectDB();
        try {
            String sql = "CREATE TABLE COMPANY "
                    + "(ID INT PRIMARY KEY     NOT NULL,"
                    + " NAME           TEXT    NOT NULL, "
                    + " AGE            INT     NOT NULL, "
                    + " ADDRESS        CHAR(50), "
                    + " SALARY         REAL)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

    }

    public void connectDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database/test.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void insertItem(dbData a[], String table) {
        connectDB();
        String query = "INSERT INTO " + table + " (";
        String query2 = "";
        try {

            for (int i = 0; i < a.length; i++) {
                dbData data = a[i];
                query += data.getIndex() + ",";
                // ps.setString(i + 1, data.getData());
                query2 += "'" + data.getData() + "',";
            }
            query = query.substring(0, query.length() - 1);
            query += ") VALUES(";

            query2 = query2.substring(0, query2.length() - 1);
            query2 += ");";
            query += query2;

            ps = c.prepareStatement(query);
            ps.executeUpdate();
            ps.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("here: " + e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }

    public void insertItemOnly(dbData a[], String table) {
        connectDB();
        String query = "INSERT INTO " + table + "  ";
        String query2 = "";
        try {

            for (int i = 0; i < a.length; i++) {
                dbData data = a[i];
                // ps.setString(i + 1, data.getData());
                query2 += "'" + data.getData() + "',";
            }
            query = query.substring(0, query.length() - 1);
            query += " VALUES(";

            query2 = query2.substring(0, query2.length() - 1);
            query2 += ");";
            query += query2;


            ps = c.prepareStatement(query);
            ps.executeUpdate();
            ps.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("here: " + e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }

    public void selectItem() {
        connectDB();
        try {
            rs = stmt.executeQuery("SELECT * FROM COMPANY;");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                float salary = rs.getFloat("salary");
                System.out.println("ID = " + id);
                System.out.println("NAME = " + name);
                System.out.println("AGE = " + age);
                System.out.println("ADDRESS = " + address);
                System.out.println("SALARY = " + salary);
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println("here: " + e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }

    public void updateItem(dbData a[], String table, String whr) {
        connectDB();
        String query = "UPDATE " + table + " SET  ";
        String query2 = "";
        try {

            for (int i = 0; i < a.length; i++) {
                dbData data = a[i];
                query += data.getIndex() + "= '" + data.getData() + "',";
            }
            query = query.substring(0, query.length() - 1);
            query += "  WHERE " + whr + ";";
            System.out.println(query);

            ps = c.prepareStatement(query);
            ps.executeUpdate();
            c.commit();
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }

    public void deleteItem(String table, String whr) {
        connectDB();
        String query = "DELETE FROM " + table + " WHERE  " + whr;
        String query2 = "";
        try {
            System.out.println(query);

            ps = c.prepareStatement(query);
            ps.executeUpdate();
            c.commit();
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}

class dbData {

    public String data;
    public String index;

    dbData(String index, String data) {
        this.data = data;
        this.index = index;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIndex() {
        return this.index;
    }
}


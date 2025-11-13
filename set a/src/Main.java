package src;
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/pb_company";
        String user = "root";  
        String password = "vyasrana12"; // 

        try {
            // Step 1: Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Connect to MySQL
            Connection con = DriverManager.getConnection(url, user, password);

            // Step 3: Fetch all records
            String query = "SELECT empid, name, salary FROM emp";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            // Header
            System.out.println("──────────────────────────────────────");
            System.out.println("EmpID\tName\t\tSalary");
            System.out.println("──────────────────────────────────────");

            // Display rows
            while (rs.next()) {
                int id = rs.getInt("empid");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");

                System.out.printf("%d\t%-15s\t%.2f%n", id, name, salary);
            }

            System.out.println("──────────────────────────────────────");

            // Close resources
            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

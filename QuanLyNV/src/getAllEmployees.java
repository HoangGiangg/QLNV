import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDAO {

    // Method to retrieve and display all employees
    public void getAllEmployees() {
        String sql = "SELECT * FROM employee";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                int departmentId = rs.getInt("departmentid");  // Ensure this matches your DB column name

                System.out.println("ID: " + id + ", Name: " + name + ", Sex: " + sex + 
                                   ", Address: " + address + ", Email: " + email + 
                                   ", Phone: " + phone + ", Department ID: " + departmentId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

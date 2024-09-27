import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {

    // Method to add an employee
    public void addEmployee(Employee employee) {
        String sql = "INSERT INTO employee (id, name, sex, address, email, phone, departmentid) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, employee.getId());             // Assuming id is an integer
            stmt.setString(2, employee.getName());
            stmt.setString(3, employee.getSex());
            stmt.setString(4, employee.getAddress());
            stmt.setString(5, employee.getEmail());
            stmt.setString(6, employee.getPhone());
            stmt.setString(7, employee.getDepartmentId());   // Assuming departmentId is an integer

            stmt.executeUpdate();
            System.out.println("Employee added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to update an employee
    public void updateEmployee(Employee employee) {
        String sql = "UPDATE employee SET name = ?, sex = ?, address = ?, email = ?, phone = ?, departmentid = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, employee.getName());
            stmt.setString(2, employee.getSex());
            stmt.setString(3, employee.getAddress());
            stmt.setString(4, employee.getEmail());
            stmt.setString(5, employee.getPhone());
            stmt.setString(6, employee.getDepartmentId());   // Assuming departmentId is an integer
            stmt.setString(7, employee.getId());             // Assuming id is an integer

            stmt.executeUpdate();
            System.out.println("Employee updated successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Other methods: delete, getEmployeeById, getAllEmployees, etc.
}

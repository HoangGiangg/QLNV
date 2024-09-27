import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepartmentDAO {

    // Thêm department (giả định departmentid là AUTO_INCREMENT)
    public void addDepartment(Department department) {
        String sql = "INSERT INTO department (departmentid, departmentname) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, department.getId());  // Chèn departmentid
            stmt.setString(2, department.getName());  // Chèn departmentname
            stmt.executeUpdate();

            System.out.println("Department added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Xóa department theo id
    public void deleteDepartment(String id) {
        String sql = "DELETE FROM department WHERE departmentid = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, id);  // Xóa theo departmentid
            stmt.executeUpdate();

            System.out.println("Department deleted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Các chức năng khác: update, getDepartmentById, getAllDepartments
}

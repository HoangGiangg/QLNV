public class Employee {
    private String id;
    private String name;
    private String sex;
    private String address;
    private String email;
    private String phone;
    private String departmentId;

    // Constructor
    public Employee(String id, String name, String sex, String address, String email, String phone, String departmentId) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.departmentId = departmentId;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getDepartmentId() { return departmentId; }
    public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }

    // Override toString() method
    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Sex=" + sex + 
               ", Address=" + address + ", Email=" + email + 
               ", Phone=" + phone + ", DepartmentID=" + departmentId + "]";
    }

    // Override equals() to compare objects based on id
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Employee other = (Employee) obj;
        return id.equals(other.id);
    }

    // Override hashCode() for hash-based collections
    @Override
    public int hashCode() {
        return id.hashCode();
    }
}

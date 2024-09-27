public class Department {
    private String id;
    private String name;

    // Constructor
    public Department(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Override toString method for better object representation
    @Override
    public String toString() {
        return "Department [ID=" + id + ", Name=" + name + "]";
    }

    // Override equals method to compare objects based on id and name
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Department other = (Department) obj;
        return id.equals(other.id) && name.equals(other.name);
    }

    // Override hashCode method to ensure consistency when used in hashed collections
    @Override
    public int hashCode() {
        return id.hashCode() + name.hashCode();
    }
}

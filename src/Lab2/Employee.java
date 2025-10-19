package Lab2;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
        department.addEmployee(this);
    }

    @Override
    public String toString() {
        String head = department.getHead();

        String departmentName = department.getName();
        return name + " работает в отделе " + departmentName + ", начальник которого " + head;
    }

    public String getName(){
        return name;
    }
}

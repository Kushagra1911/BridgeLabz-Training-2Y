class Employee {
    public int employeeID;
    protected String department;
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
    }

}

class Manager extends Employee {
    Manager(int id, String dept, double sal) {
        super(id, dept, sal);
    }

    void show() {
        System.out.println(employeeID + " " + department);
    }
}

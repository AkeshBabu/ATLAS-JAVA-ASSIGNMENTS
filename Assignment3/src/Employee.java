public class Employee {

    String employeeID;
    String name;
    int salary;

    public Employee() {
        this("NA", "NA", 0);
    }

    public Employee(String employeeID, String name, int salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;


    }

    void showEmployee() {
        System.out.println("Employee Details: "+employeeID+" "+name+" "+salary);
    }
}

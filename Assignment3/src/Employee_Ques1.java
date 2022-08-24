public class Employee_Ques1 {

    String employeeID;
    String name;
    int salary;

    public Employee_Ques1()
    {
        this("NA","NA",0);
    }

    public Employee_Ques1(String employeeID, String name, int salary)
    {
        this.employeeID=employeeID;
        this.name=name;
        this.salary=salary;
    }

    public static void main(String [] args)
    {
        Employee_Ques1 emp=new Employee_Ques1();
        Employee_Ques1 emp1=new Employee_Ques1("EMP_12345","Jon Doe",500000);
        Employee_Ques1 emp2=new Employee_Ques1("EMP_12356","Jon Cena",520000);
        Employee_Ques1 emp3=new Employee_Ques1("EMP_12456","Shane Watson ",900000);

        System.out.println("~~~~~~~~~~~~~~~~~Employee Details are as follows~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(emp.employeeID+" "+emp.name+" "+emp.salary);
        System.out.println(emp1.employeeID+" "+emp1.name+" "+emp1.salary);
        System.out.println(emp2.employeeID+" "+emp2.name+" "+emp2.salary);
        System.out.println(emp3.employeeID+" "+emp3.name+" "+emp3.salary);


    }


}

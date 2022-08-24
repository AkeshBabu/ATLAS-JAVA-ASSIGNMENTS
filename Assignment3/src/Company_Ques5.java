class Company{

    String name;
    String phone;
    String email;

    Employee[] employees;

    public Company()
    {
        this("NA","NA","NA");
    }
    public Company(String name,String phone,String email)
    {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    void setEmployee(Employee[] employees) {
        this.employees = employees;
    }

    void showCompany() {
        System.out.println("Company Details: "+name+" "+phone+" "+email);
        //System.out.println("User Address Is: "+address);
        //address.showAddress();
        System.out.println();
        System.out.println("Employee Details ["+employees.length+"] Are: "+employees);

        for(Employee emps : employees) {
            emps.showEmployee();
            System.out.println();
        }

    }


}

public class Company_Ques5 {

        public static void main(String [] args)
        {


            Company comp1 = new Company("AMAZON", "+91 99999 11111", "john@example.com");
            Employee employee1 = new Employee("EMP_123789", "Adam", 12345670);


            System.out.println("comp1 is: "+comp1);
            System.out.println("employee1 is: "+employee1);


            Employee emp[]=new Employee[3];
            emp[0]=new Employee("EMP_12345","Jon Doe",500000);
            emp[1]=new Employee("EMP_12356","Jon Cena",520000);
            emp[2]=new Employee("EMP_12456","Shane Watson ",900000);

            comp1.setEmployee(emp);
            System.out.println();
            comp1.showCompany();

        }


}

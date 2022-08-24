public class User_Ques2 {


    String name;
    String email;

    long phone;

    String address;

    String gender;


    public User_Ques2()
    {
        this("NA","NA",0,"NA","NA");
    }

    public User_Ques2(String name, String email, long phone,String address,String gender)
    {
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.address=address;
        this.gender=gender;
    }

    public static void main(String [] args)
    {
        User_Ques2 usr=new User_Ques2();
        User_Ques2 usr1=new User_Ques2("TOM","tom@gmail.com",1234567890L," NY,NY","Male");
        User_Ques2 usr2=new User_Ques2("DICK","dick@gmail.com",2345678901L,"Chicago,IL","MALE");
        User_Ques2 usr3=new User_Ques2("HARRY","harry@gmail.com",3456789012L,"SF,CA","MALE");

        System.out.println("~~~~~~~~~~~~~~~~~USER'S Details are as follows~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(usr.name+" "+usr.email+" "+usr.phone+" "+usr.address+" "+usr.gender);
        System.out.println(usr1.name+" "+usr1.email+" "+usr1.phone+" "+usr1.address+" "+usr1.gender);
        System.out.println(usr2.name+" "+usr2.email+" "+usr2.phone+" "+usr2.address+" "+usr2.gender);
        System.out.println(usr3.name+" "+usr3.email+" "+usr3.phone+" "+usr3.address+" "+usr3.gender);


    }
}

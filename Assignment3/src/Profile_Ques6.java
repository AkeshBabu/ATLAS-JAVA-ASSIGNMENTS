public class Profile_Ques6 {

    String name;
    String email;
    String dob;

    public Profile_Ques6()
    {
        this("NA","NA","NA");
    }

    public Profile_Ques6(String name,String email,String dob)
    {
        this.name=name;
        this.email=email;
        this.dob=dob;

        //System.out.println("Default Profile values are");
        System.out.println("Default values are"+" name:"+name+" email:"+email+" dob:"+dob);
    }

    void updateProfile(String name,String email,String dob)
    {
        this.name=name;
        this.email=email;
        this.dob=dob;

        System.out.println("Profile Updated Successfully ");
        System.out.println("Updated values are"+" name:"+name+" email:"+email+" dob:"+dob);
    }

    public static  void main(String [] args)
    {
        //Profile_Ques6 profile=new Profile_Ques6();
        Profile_Ques6 profile=new Profile_Ques6("David","david@gmail.com","10-July-2002");
        profile.updateProfile("Cena","cena@gmail.com","7-July-2007");
    }
}

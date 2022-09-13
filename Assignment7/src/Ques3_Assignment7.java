class User{

    String fname;
    String lname;

    String phone;

    String email;

    String gender;

    String address;


    User(){
        fname = "John";
        lname = "Watson";
        phone="123456790";
        email="abcd@gmail.com";
        gender="MALE";
        address="New York";
        System.out.println("[Parent] Object Constructed - Default Constructor");
    }

    void show() {
        System.out.println("[Parent] fname: "+fname+" lname: "+lname+" wealth: "+phone+" email:"+email+" gender:"+gender+" address:"+address);
    }
}

// Child here is an extension of Parent :) | Inheritance
class PrimeUser extends User{

    //String fname;
    String  validTill;
    String befinits;

    PrimeUser(){
        //fname = "Fionna";
        validTill = "June-2023";
        befinits = "Free Ship,Music and Video";
        System.out.println("[Child] Object Constructed - Default Constructor");
    }

    // The method show of Child, overrides the Parent's Method
    // ReDefining the method of Parent, in Child so as to have a customized definition in the Child
    void show() {
        //super.wealth -= 5000;
        //super.show(); // super is a reference variable which refers to the Parent Object from the Child Object :)
        System.out.println("[Child] fname: "+fname+" lname: "+lname+" phone:"+phone+" address:"+address+" benifits: "+befinits+" validTill: "+validTill);
    }

}

// RULES:
// 1. To inherit, we need to use keyword extends
// 2. Before the Object of Child, Parent's Object is constructed in the memory :)
// 3. Child can access anything in Parent other than private, IFF Child does not have it :)
//	  if child has its property, then it will access its own property :)


public class Ques3_Assignment7 {

    public static void main(String[] args) {

//        User pRef = new User();
//        System.out.println("pRef is: "+pRef);
//        pRef.show();
//
//        System.out.println();

        PrimeUser cRef = new PrimeUser();
        System.out.println("cRef is: "+cRef);

        //cRef.wealth -= 12000;
        cRef.show();

    }

}
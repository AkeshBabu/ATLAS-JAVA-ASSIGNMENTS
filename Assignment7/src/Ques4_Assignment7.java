import java.util.Scanner;


// We can create abstract methods inside the Absract Class
abstract class Cab{

    Cab(){
        System.out.println("[Cab] Object Constructed");
    }

    // abstract method has no definition
    // We will create a RULE
    // If any class inherits the ServicePayment class, the child class must define the method payForService
    abstract void bookCab(String source,String destination, int distance);

    void welcome() {
        System.out.println("Welcome to Cab :)");
    }

}

class MiniCab extends Cab{

    MiniCab(){
        System.out.println("[MiniCab] Object Constructed");
    }

    void bookCab(String source,String destination,int distance) {
        welcome();
        System.out.println("[MiniCab] Enter Source:"+source);
        System.out.println("[MiniCab] Enter Destination:"+destination);
        //System.out.println("[MiniCab] Select Route  ");
        System.out.println("[MiniCab] Total distance bewteen source and destination:"+distance);
    }
}

class SedanCab extends Cab{

    SedanCab(){
        System.out.println("[SedanCab] Object Constructed");
    }

    void bookCab(String source,String destination,int distance) {
        System.out.println("[SedanCab] Total distance between source:"+source+" and destination:"+destination+" is:"+distance);
    }
}

class LuxuryCab extends Cab{

    LuxuryCab(){
        System.out.println("[LuxuryCab] Object Constructed");
    }

    void bookCab(String source,String destination,int distance) {
        System.out.println("[LuxuryCab] Total distance between source:"+source+" and destination:"+destination+" is:"+distance);
    }
}

class CabApp{

    Cab selectService(int option) {

        Cab service = null;

        if(option == 1) {
            service = new MiniCab();
        }else if(option == 2) {
            service = new SedanCab();
        }else if(option == 3) {
            service = new LuxuryCab();
        }else {
            System.err.println("Select the Payment Method First");
        }

        return service;

    }

}

public class Ques4_Assignment7 {

    public static void main(String[] args) {

        CabApp app = new CabApp();

        System.out.println("1: Mini Cab");
        System.out.println("2: Sedan Cab");
        System.out.println("3: Luxury Cab");
        System.out.println("Select the Option: (1-3): ");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.close();

        //ServicePayment service = new ServicePayment(); -> ERROR (Abstract Class cannot have Objects)

        Cab service = app.selectService(option);
        if(service != null) {
            service.bookCab("Lucknow","Delhi",500);
        }

    }

}
import java.util.Scanner;

class Restaurant{

    String name;
    String phone;
    String address;
    String operating_hr;
    int pricePerPerson;
    int rating;

    public Restaurant(String name, String phone, String address, String operating_hr, int pricePerPerson, int rating) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.operating_hr = operating_hr;
        this.pricePerPerson = pricePerPerson;
        this.rating = rating;
    }

    public Restaurant() {
        this("NA","NA","NA","NA",0,0);
    }

    void inputData(){
        Scanner scanner=new Scanner(System.in);

        name=scanner.nextLine();
        phone=scanner.nextLine();
        address=scanner.nextLine();
        operating_hr=scanner.nextLine();
        pricePerPerson=scanner.nextInt();
        rating=scanner.nextInt();
    }

   void printData(Restaurant [] restaurants){
        System.out.println("~~~~~~~~~~Restaurant Data is~~~~~~~~~~~~~~`");
        for (Restaurant ele:restaurants) {
            System.out.println("Restaurant name is:"+ele.name+" phone is:"+ele.phone+" address is:"+ele.address+" operating hours are:"+ele.operating_hr+" price/person is:"+ele.pricePerPerson+" rating is:"+ele.rating);
        }
    }
}

public class Ques1_Assignment7 {

    public static void main(String[] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the number of Restaurants you want to add data");
        int n=scr.nextInt();
        Restaurant [] arr=new Restaurant[n];
        for (int i=0;i<n;i++){
            Restaurant restaurant=new Restaurant();
            restaurant.inputData();
            arr[i]=restaurant;
        }
        Restaurant obj=new Restaurant();
        obj.printData(arr);




    }
}

import java.util.Scanner;

public class assignment2_quesTwo {
	
	double mini_base_fare;
	double sedan_base_fare;
	double suv_base_fare;
	double rate_per_km_mini;
	double rate_per_km_sedan;
	double rate_per_km_suv;
	double ride_time_charge;
	assignment2_quesTwo()
	{
		 mini_base_fare=30;
		 sedan_base_fare=40;
		 suv_base_fare=50;
		 rate_per_km_mini=10;
		 rate_per_km_sedan=15;
		 rate_per_km_suv=20;
		 ride_time_charge=1.5;
	}
	 void fare(String source,String destination,String type_of_cab,double distance,double time)
	{
		double total_fare;
		char symbol='\u20B9';
		if(type_of_cab.equalsIgnoreCase("MINI"))
		{
			total_fare=this.mini_base_fare + (this.rate_per_km_mini*distance)+(this.ride_time_charge*time);
			System.out.println("Total Charges for your MINI ride is:"+symbol+total_fare);
		}
		else if(type_of_cab.equalsIgnoreCase("SEDAN")){
			total_fare=this.sedan_base_fare + (this.rate_per_km_sedan*distance)+(this.ride_time_charge*time);
			System.out.println("Total Charges for your MINI ride is:"+symbol+total_fare);
		}
		else if(type_of_cab.equalsIgnoreCase("SUV")){
			total_fare=this.suv_base_fare + (this.rate_per_km_suv*distance)+(this.ride_time_charge*time);
			System.out.println("Total Charges for your MINI ride is:"+symbol+total_fare);
		}
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the type of cab you want ");
		System.out.println("Enter MINI ");
		System.out.println("Enter SEDAN ");
		System.out.println("Enter SUV ");
		String source, destination,type_of_cab;
		double distance,time;
		System.out.println("~~~~~~~~~~~~~~Enter the following details~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Enter Source,Destination,Type of Cab, distance and time");
		Scanner scr=new Scanner(System.in);
		
		source=scr.nextLine();
		destination=scr.nextLine();
		type_of_cab=scr.nextLine();
		distance=scr.nextDouble();
		time=scr.nextDouble();
		
		scr.close();
		assignment2_quesTwo obj=new assignment2_quesTwo();
		obj.fare(source,destination,type_of_cab,distance,time);
	}

}

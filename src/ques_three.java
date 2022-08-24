import java.util.*;
public class ques_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		
		System.out.println("Enter the Amount and GST rate");
		double amt=scr.nextDouble();
		double rate=scr.nextDouble();
		double gstAmt;
		
		gstAmt=amt*(rate/100);
		double AmtPayable=amt+gstAmt;
		
		System.out.println("GST payable on the amount "+amt+" is:"+gstAmt);
		System.out.println("Total Amount Payable including GST is:"+AmtPayable);
		

	}

}

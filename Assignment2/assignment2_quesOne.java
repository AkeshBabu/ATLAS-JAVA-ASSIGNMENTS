import java.util.*;
public class assignment2_quesOne {

	
	static void promoCode(String promo,double amt)
	{
		
		switch(promo)
		{
		case "WELCOME":
			if(amt >= 149)
			{
				amt=amt-(amt*0.10);
				System.out.println("Total amount payable after discount is:"+amt);
			}
			else {
				System.out.println("Sorry promo code not applicable amount is <149");
			}
			break;
		case "PARTY":
			if(amt >= 349)
			{
				amt=amt-(amt*0.20);
				System.out.println("Total amount payable after discount is:"+amt);
			}
			else {
				System.out.println("Sorry promo code not applicable amount is <349");
			}
			break;
		case "JUMBO":
			if(amt >= 549)
			{
				amt=amt-(amt*0.30);
				System.out.println("Total amount payable after discount is:"+amt);
			}
			else {
				System.out.println("Sorry promo code not applicable amount is <549");
			}
			break;	
		default:
			System.out.println("Sorry Invalid Promo Code");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any of  the Following promo code to get discount ");
		System.out.println("Enter WELCOME to get 10% off if total amount is >=149");
		System.out.println("Enter PARTY to get 20% off if total amount is >=349");
		System.out.println("Enter JUMBO to get 30% off if total amount is >=549");
		String promo;
		double amt;
		System.out.println("~~~~~~~~~~~~~~Enter the promo and amount~~~~~~~~~~~~~~~~~~~~");
		Scanner scr=new Scanner(System.in);
		
		promo=scr.nextLine();
		amt=scr.nextDouble();
		
		scr.close();
		
		
		assignment2_quesOne.promoCode(promo,amt);
		
	}

}

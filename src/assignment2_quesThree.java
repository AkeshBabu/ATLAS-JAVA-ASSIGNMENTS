import java.util.*;
public class assignment2_quesThree {

	static int count7(int n)
	{
		int c=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem==7)
				c++;
			n=n/10;
		}
		return c;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scr.nextInt();
		scr.close();
		int res=assignment2_quesThree.count7(n); 
		System.out.println("count of 7 is "+res);
	}

}

import java.util.*;
public class assignment2_quesFour {

	static void middleName(StringBuilder str)
	{
		StringBuilder temp=new StringBuilder("");
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==',')
			{
				 temp=str.subSequence(0, i);
				 int indexf=str.indexOf(" ");
				 int indexl=str.lastIndexOf(" ");
				 String middle=str.substring(indexf, indexl);
				 if(indexf==indexl)
				 {
					 System.out.println("NULL");
				 }
				 else
				 {
					 System.out.println("Middle Name is: "+middle);
				 }
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("");  
		Scanner scr=new Scanner(System.in);
		
		
		String name=scr.nextLine();
		sb.append(name);
		scr.close();
		assignment2_quesFour.middleName(sb);
		
	}

}

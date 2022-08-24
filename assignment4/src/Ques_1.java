import java.util.Scanner;

public class Ques_1 {

    public static void main(String [] args){
        int arr[]=new int[10];
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=scr.nextInt();
        System.out.println("Enter the elements in the array");

        for (int i=0;i<n;i++)
        {
            arr[i]=scr.nextInt();
        }
        int min=arr[0],max=0,avg=0,sum=0;

        for (int i=0;i<n;i++)
        {
            if(arr[i]< min){
                min=arr[i];
            }
            if (arr[i]> max)
            {
                max=arr[i];
            }
            sum=sum+arr[i];
        }
        avg=sum/n;
        System.out.println("Minimum num is:"+min+" Maximum is:"+max+" Average is:"+avg);
    }
}

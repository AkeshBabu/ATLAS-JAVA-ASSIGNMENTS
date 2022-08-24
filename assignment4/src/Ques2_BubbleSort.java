import java.util.Scanner;

public class Ques2_BubbleSort {


    void sort(int arr[],int n){
                traverse(arr,n);
                for (int i=0;i<n;i++)
                {
                    for (int j=i+1;j<n;j++){
                        if (arr[j] > arr[i])
                        {
                            int temp=arr[j];
                            arr[j]=arr[i];
                            arr[i]=temp;
                        }
                    }
                }
                asec(arr,n);
                desc(arr,n);
    }

    void asec(int arr[],int n){

        System.out.println();
        System.out.println("Sorted array in Ascending  order is:");
        for (int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }

    }
    void desc(int arr[], int n){

        System.out.println();
        System.out.println("Sorted array in Descending order is:");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    void traverse(int arr[],int n){
        System.out.println();
        System.out.println("Orignal Array is:");
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args){

        int arr[]=new int[10];
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array(Max 10)");
        int n=scr.nextInt();
        System.out.println("Enter the elements in the array");

        for (int i=0;i<n;i++)
        {
            arr[i]=scr.nextInt();
        }
        Ques2_BubbleSort obj=new Ques2_BubbleSort();
        obj.sort(arr,n);


    }

}

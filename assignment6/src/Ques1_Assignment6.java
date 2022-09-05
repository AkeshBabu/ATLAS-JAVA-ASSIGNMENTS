class BubbleSort{
    void sort(int [] arr){
        int len=arr.length;

        for (int i=0;i<len;i++){
            for (int j=i+1;j<len;j++){

                if (arr[i]>arr[j]){
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array is:");
        for (int ele:arr) {
            System.out.print(" "+ele);
        }
    }
}
public class Ques1_Assignment6 {

    public static void main(String [] args){

        BubbleSort sort=new BubbleSort();
        int arr[]={12, 23, 45, 33, 66, 5, 74, 3, 12, 9, 17};
        sort.sort(arr);
    }
}

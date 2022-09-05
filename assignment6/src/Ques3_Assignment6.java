import java.util.Scanner;

class StringSort{
    void sort(String s){

        int len=s.length();

        char ch[]=s.toCharArray();
        for (int i=0;i<len;i++){
            for (int j=i+1;j<len;j++){
                if (ch[i]>ch[j]){
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array is:");
        for (char ele:ch) {
            System.out.print(ele);
        }
    }
}
public class Ques3_Assignment6 {

    public static void main(String [] args){
        StringSort stringSort=new StringSort();
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        stringSort.sort(name);
    }
}

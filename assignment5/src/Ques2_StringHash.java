import java.io.*;
import java.util.Scanner;

class Hash
{
    void stringHash(String str){

        int len=str.length();
        int charSum=0,hcode;
        for (int i=1;i<=len;i++){
            char c=str.charAt(i-1);
            charSum=charSum+(int)c*i;
           // System.out.println(c);
        }
        hcode=(charSum%2069);
        System.out.println("Hash code for string is :"+hcode);
    }
}
public class Ques2_StringHash
{

    public static void main(String[] args)
    {
            Scanner scr=new Scanner(System.in);
            System.out.println("Enter the String to compute hashcode:");
            String str = scr.nextLine();
            System.out.println("Entered String is:"+str);
            Hash hash=new Hash();
            hash.stringHash(str);

    }
}



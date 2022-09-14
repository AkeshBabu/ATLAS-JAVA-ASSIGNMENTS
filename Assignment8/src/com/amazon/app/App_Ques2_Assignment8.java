package com.amazon.app;

import com.amazon.model.User;
import com.amazon.model.User_Ques2_Assignment8;

import java.util.Scanner;

class Child extends User_Ques2_Assignment8 {

}

public class App_Ques2_Assignment8 {

    public static void main(String [] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of users:");
        int len=scanner.nextInt();

        User_Ques2_Assignment8 userarr[]=new User_Ques2_Assignment8[len];
        for (int i=0;i<len;i++){
            Child child=new Child();
            child.inputData();
            userarr[i]=child;

        }

        System.out.println("~~~~~~~~~~~~~~~`User Details~~~~~~~~~~~~~~");
        for (int i=0;i<len;i++){
            userarr[i].show();
        }
    }
}

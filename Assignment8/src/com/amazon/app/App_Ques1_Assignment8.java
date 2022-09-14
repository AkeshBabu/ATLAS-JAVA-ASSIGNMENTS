package com.amazon.app;

import com.amazon.model.User;

import java.util.Scanner;

public class App_Ques1_Assignment8 {
    public static void main(String [] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of users:");
        int len=scanner.nextInt();

        User userarr[]=new User[len];
        for (int i=0;i<len;i++){
            User user=new User();
            user.inputData();
            userarr[i]=user;
        }
        System.out.println("~~~~~~~~~~~~~~~`User Details~~~~~~~~~~~~~~");
        for (int i=0;i<len;i++){
            userarr[i].show();
        }
    }
}

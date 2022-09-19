package com.amazon.exceptions;

import java.util.Scanner;

class BankAccount extends Exception{
    String name;
    int number;
    int balance;
    public BankAccount(String s){
        super(s);
        //this("NA",0,0);
    }
    public BankAccount(String name,int number,int balance){
        this.name=name;
        this.number=number;
        this.balance=balance;
        //super(s);
    }

    public BankAccount() {

    }

    void deposit(BankAccount [] arr, int amount){
         //this.balance+=amount;
        for (BankAccount ele:arr) {
            if (ele== null){
                System.out.println("element not found");
            }
            else{
                ele.balance+=amount;
            }

        }
    }

    void withdraw(BankAccount[] arr,int amount){
        try {
            for (BankAccount ele:arr) {
                ele.balance-=amount;
                if (ele.balance<0){
                    throw new Exception("Balance not avail");
                }
                else {
                    System.out.println("Name:"+ele.name+"account Details:"+ele.number+"balance:"+ele.balance);
                }
            }
            //this.balance-=amount;

        }catch (Exception e){
            System.out.println("Can't withdraw this amount as sufficient balance not avail");
            System.out.println(e.getMessage());
        }

    }

    void inputData(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name:");
        name=scanner.nextLine();
        System.out.println("\nEnter account number:");
        number=scanner.nextInt();
        System.out.println("\nEnter balance:");
        balance=scanner.nextInt();
        //return null;
    }
}

public class Ques5_Assignment8 {
    public static void main(String [] args){

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        BankAccount bankAccount=new BankAccount();
        BankAccount [] arr=new BankAccount[n];
        for (int i=0;i<n;i++){
            BankAccount bankAccount1=new BankAccount();
            bankAccount1.inputData();
            arr[i]=bankAccount1;
        }

        for (int i=0;i<n;i++){
            System.out.println("Enter the deposit amount:");
            int dep=scanner.nextInt();
            bankAccount.deposit(arr,dep);
            System.out.println("Enter the withdraw amount:");
            int draw=scanner.nextInt();
            bankAccount.withdraw(arr,draw);
        }


        for (BankAccount ele:arr) {
            System.out.println("Name:"+ele.name+" account number:"+ele.number+" account balancce:"+ele.balance);
        }

    }
}

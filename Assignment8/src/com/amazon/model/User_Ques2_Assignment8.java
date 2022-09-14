package com.amazon.model;

import java.util.Scanner;

public class User_Ques2_Assignment8 {

    String name;
    protected String phone;
    protected String email;
    protected String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputData(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=scanner.nextLine();
        setName(name);
        System.out.println("Enter phone:");
        String phone=scanner.nextLine();
        setPhone(phone);
        System.out.println("Enter email:");
        String email=scanner.nextLine();
        setEmail(email);
        System.out.println("Enter address:");
        String address=scanner.nextLine();
        setAddress(address);
    }
    public void show(){

        System.out.println(" Name: "+getName()+" email: "+getEmail()+" address: "+getAddress()+" phone:"+getPhone());
    }

}

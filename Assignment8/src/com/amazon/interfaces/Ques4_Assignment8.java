package com.amazon.interfaces;

interface Cab{
    void bookCab(String source, String destination,String  distance);

}
class MiniCab implements Cab{

    @Override
    public void bookCab(String source, String destination, String distance) {
        System.out.println("~~~~~~~~~~~~~~~Booking your cab~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("[MiniCab] Source:"+source+" destination:"+destination+" total distance:"+distance);
        System.out.println("~~~~~~~~~~~~~~~Congratulations your Mini Cab is booked~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

class SedanCab implements Cab{

    @Override
    public void bookCab(String source, String destination, String distance) {
        System.out.println("~~~~~~~~~~~~~~~Booking your cab~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("[MiniCab] Source:"+source+" destination:"+destination+" total distance:"+distance);
        System.out.println("~~~~~~~~~~~~~~~Congratulations your Sedan Cab is booked~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
class LuxuryCab implements Cab{

    @Override
    public void bookCab(String source, String destination, String distance) {
        System.out.println("~~~~~~~~~~~~~~~Booking your cab~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("[MiniCab] Source:"+source+" destination:"+destination+" total distance:"+distance);
        System.out.println("~~~~~~~~~~~~~~~Congratulations your Luxury Cab is booked~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

public class Ques4_Assignment8 {

    public static void main(String [] args){

        MiniCab miniCab=new MiniCab();
        miniCab.bookCab("Lucknow","Kanpur","80");

        SedanCab sedanCab=new SedanCab();
        sedanCab.bookCab("Lucknow","Delhi","450");

        LuxuryCab luxuryCab=new LuxuryCab();
        luxuryCab.bookCab("Lucknow","Jaipur","600");
    }
}

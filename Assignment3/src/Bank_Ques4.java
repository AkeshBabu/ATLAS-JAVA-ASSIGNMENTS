public class Bank_Ques4 {

    long accountNum;
    String name;
    int balance;

    public Bank_Ques4()
    {
        this(0,"NA",0);
    }
    public Bank_Ques4(long accountNum,String name, int balance)
    {
        this.accountNum=accountNum;
        this.name=name;
        this.balance=balance;
    }

    public static void main(String [] args)
    {
        Bank_Ques4 bank=new Bank_Ques4();
        Bank_Ques4 bank1=new Bank_Ques4(123456,"JOHN DOE",14567890);

        System.out.println(bank.accountNum+" "+ bank.name+" "+ bank.balance);
        System.out.println(bank1.accountNum+" "+ bank1.name+" "+ bank1.balance);
    }
}

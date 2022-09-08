import java.util.Scanner;

class BlankAccount{

    private  String accountNum;
    private  String balance;
    private  String name;
    private  String phone;
    private  String email;

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

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
}

public class Ques2_Assignment7 {

    public static void main(String [] args){

        BlankAccount blankAccount=new BlankAccount();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Bank Account Details");
        String accNum=scanner.nextLine();
        String bal=scanner.nextLine();
        String name=scanner.nextLine();
        String phone=scanner.nextLine();
        String email=scanner.nextLine();

        blankAccount.setAccountNum(accNum);
        blankAccount.setBalance(bal);
        blankAccount.setName(name);
        blankAccount.setPhone(phone);
        blankAccount.setEmail(email);

        System.out.println("~~~~~~~Printing Account Details~~~~~~~~~~");
        System.out.println("| "+blankAccount.getName()+" |"+blankAccount.getEmail()+" |"+blankAccount.getPhone()+" |"+blankAccount.getAccountNum()+" |"+blankAccount.getBalance()+" |");
    }
}

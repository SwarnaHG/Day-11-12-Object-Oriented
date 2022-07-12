package bankAccount;
import java.util.Scanner;
public class Account {
    Scanner sc = new Scanner(System.in);

    static String name;
    private static int balance = 10000;

    public void toViewBalnce(){
        System.out.println(balance);
    }


    public void toAddBalnce() {

        System.out.println("Please enter the valid amount to add");
        int amount = sc.nextInt();
        //add this amount to balance
        balance = balance +amount;
        System.out.println("The updated account balance is"+ " " + balance);
    }




    public void toWithdraw() {
        System.out.println("Enter the amount to be withdrawn");
        int amount = sc.nextInt();
        if(amount <=0) {
            System.out.println("enter valid amount for withdraw");

        }
        else if(amount <= balance) {
            System.out.println("plese wait...,as withdrawn is under process......");
            System.out.println("Withdrawn process is successfull..");
            balance = balance - amount;
            System.out.println("updated balance is" + " " +balance);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }


}

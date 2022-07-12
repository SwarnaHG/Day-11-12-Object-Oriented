package bankAccount;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("""
							1 -> to view current balance
							2 -> to add amount
							3 -> to withdraw

					""");
            Account acc = new Account();
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("The balance is:");
                    acc.toViewBalnce();

                    break;
                case 2:
                    acc.toAddBalnce();
                    break;
                case 3:
                    acc.toWithdraw();
                    break;


            }

        }
    }
}

package stockmanagement;
import java.util.Scanner;
public class StockPortfolio extends Stock {
    public static void main(String[] args) {
        //to enter the number of stocks from user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of stocks");
        setNoOfStocks(sc.nextInt());
        for(int i =1;i <= getNoOfStocks(); i++) {
            //create the object of class
            Stock stock = new Stock();
            stock.toAddShare();
            totalValue = totalValue + stockPrice;

        }
        System.out.println("the total value is" +  totalValue);
    }

}

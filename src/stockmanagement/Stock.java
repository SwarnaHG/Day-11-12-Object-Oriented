package stockmanagement;
import java.util.Scanner;

public class Stock {
    private static String shareName;
    private static int noOfShares;
    private static  int sharePrice;
    private static int noOfStocks;
    static  int stockPrice;
    static int totalValue;
    public static String getShareName() {
        return shareName;
    }
    public static void setShareName(String shareName) {
        Stock.shareName = shareName;
    }
    public static int getNoOfShares() {
        return noOfShares;
    }
    public static void setNoOfShares(int noOfShares) {
        Stock.noOfShares = noOfShares;
    }
    public static int getSharePrice() {
        return sharePrice;
    }
    public static void setSharePrice(int sharePrice) {
        Stock.sharePrice = sharePrice;
    }
    public static int getNoOfStocks() {
        return noOfStocks;
    }
    public static void setNoOfStocks(int noOfStocks) {
        Stock.noOfStocks = noOfStocks;
    }


    public void toAddShare()
    {
        Scanner sc = new Scanner(System.in);
        //
        System.out.println("Enter the Name of share");
        shareName = sc.next();

        System.out.println("Enter the number of shares");
        noOfShares = sc.nextInt();

        System.out.println("Enter the price of shares");
        sharePrice = sc.nextInt();

        //to calculate stockPrice
        stockPrice = noOfShares * sharePrice;

        System.out.println("stock value"+ stockPrice);


    }

}

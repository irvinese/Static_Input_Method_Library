import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        String userResp;
        double price = SafeInput.GetRangedDouble(pipe, "How much was your item", .50, 9.99);
        boolean question = SafeInput.getYNConfirm(pipe, "do you have more items you would like to buy?");


    }
}

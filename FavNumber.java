import java.util.Scanner;

public class FavNumber {
    public static void main(String[] args) {

        Scanner pipe = new Scanner(System.in);
        int number = SafeInput.getInt(pipe, "What is your favorite number");
        System.out.println("your favorite number is: " + number);
        double input = SafeInput.getDouble(pipe, "What is your favorite double");
        System.out.println("Your favorite double is: " + input);
    }
}

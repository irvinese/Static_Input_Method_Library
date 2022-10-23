import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message;
        System.out.println("What will your message be?");
        message = scanner.nextLine();
        SafeInput.prettyHeader(message);

    }
}

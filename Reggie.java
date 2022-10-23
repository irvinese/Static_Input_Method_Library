import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        String prompt = "Enter your SSN";
        String ssnPattern = "\\d{3}-\\d{2}-\\d{4}";
        String ssn = SafeInput.getRegExString(pipe, prompt, ssnPattern);
        System.out.println("Your ssn is this: " + ssn);

        String thing = "Enter your M number";
        String mPattern = "(M|m)\\d{5}";
        String m = SafeInput.getRegExString(pipe, thing, mPattern);
        System.out.println("Your M Number is this: " + m);

        String choice = "Enter your menu choice";
        String menu = "[OoSsVvQq]";
        String mC = SafeInput.getRegExString(pipe, choice, menu);
        System.out.println("Your menu choice is this: " + mC );

    }
}

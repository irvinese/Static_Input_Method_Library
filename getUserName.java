import groovy.json.JsonOutput;

import java.util.Scanner;

public class getUserName {
    public static void main(String[] args) {


        Scanner pipe = new Scanner(System.in);
        String retString = SafeInput.getNonZeroLenString(pipe, "Enter your name");
        System.out.println("Your name is: " + retString);

    }
}

import java.util.Scanner;
public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.println("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }


    public static int getInt(Scanner pipe, String prompt) {
        int number = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println("\n" + prompt + ": ");

            if (pipe.hasNextInt()) {
                number = pipe.nextInt();
                pipe.nextLine();
                if (number >= -999999999) {
                    done = true;
                } else {
                    System.out.println("Please put in a number not: " + number);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Please enter a number, not: " + trash);
            }
        } while (!done);
        return number;
    }


    public static double getDouble(Scanner pipe, String prompt) {
        double input = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                input = pipe.nextInt();
                pipe.nextLine();
                if (input >= -999999999) {
                    done = true;
                } else {
                    System.out.println("Please put in a number not: " + input);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Please enter a number, not: " + trash);
            }
        } while (!done);
        return input;
    }


    public static double GetRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double ranged = 0;
        boolean done = true;
        String trash = "";
        do {
            System.out.println("\n" + prompt + ": ");

            if (pipe.hasNextDouble()) {
                ranged = pipe.nextDouble();
                pipe.nextLine();

                if (ranged >= low && ranged <= high) {
                    done = true;
                } else {
                    System.out.println("\n The number is out of range [" + low + "-" + high + "]: " + ranged);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enetr a number, you entered: " + trash);
            }
        } while (!done);
        return ranged;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean done = false;
        String userResp = "";
        boolean Y = true;
        boolean N = false;
        String trash = "";
        do {
            while (true) {
                System.out.println("\n" + prompt + ": ");
                pipe.nextLine();
                if (userResp.equalsIgnoreCase("Y")) {
                    break;
                }
            }
                if (userResp.equalsIgnoreCase("N")){
                    done= true;
                }
        } while (!done);
        return true;
    }

    public static String getRegExString(Scanner pipe, String propmt, String regEx) {
        String retVal = "";
        boolean done = false;

        do {
            System.out.println("\n" + propmt + ": ");
            retVal = pipe.nextLine();
            if (retVal.matches(regEx)) {
                done = true;
            } else {
                System.out.println("\n" + retVal + "must match the pattern " + regEx);
                System.out.println("try again!");
            }
        } while (!done);
        return retVal;
    }

    public static void prettyHeader(String msg) {
        for (int row = 1; row <= 3; row++) {
            for (int col =1; col <= 60; col++) {
                if(row==1||col==1||col==2||col==3||row==3||col==58||col==59||col==60)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");

        }
    }
}

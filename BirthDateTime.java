import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {

        Scanner pipe = new Scanner(System.in);
        double year = SafeInput.GetRangedDouble(pipe, "Enter the year you were born", 1950, 2010);
        double month = SafeInput.GetRangedDouble(pipe, "Enter the month you were born in number", 1, 12);
        double day = SafeInput.GetRangedDouble(pipe, "Enter the day you were born", 1, 31);
        double hour = SafeInput.GetRangedDouble(pipe, "Enter the hour you were born", 1, 24);
        double minute = SafeInput.GetRangedDouble(pipe, "Enter the minute you were born", 1, 60 );
        System.out.println(" your birth date and time is: " + year + "," + month + "," + day + "," + hour + "," + minute);


    }
}

import java.util.*;

public class LeapYear {


    boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        } 
        else if (year % 100 == 0) {
            return false;
        } 
        else if (year % 4 == 0) {
            return true;
        } 
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int y = sc.nextInt();

        LeapYear ob = new LeapYear(); 
        boolean store = ob.isLeap(y);

        if (store) {
            System.out.println(y + " is a leap year");
        } else {
            System.out.println(y + " is not a leap year");
        }
    }
}

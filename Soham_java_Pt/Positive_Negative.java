import java.util.*;

class Positive_Negative {
    int num;

    Positive_Negative(int n) {
        num = n;
    }

    boolean isPositive(int n) {
        if (n > 0) {
            return true;
        } else {
            return false;
        }
    }

    void display() {
        boolean store = isPositive(num);
        if (store) {
            System.out.println(num + " is Positive");
        } else {
            System.out.println(num + " is Negative");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        Positive_Negative ob = new Positive_Negative(num);
        ob.display();
    }
}

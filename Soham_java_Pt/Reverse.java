import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int n,d,rev=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number :");
    n=sc.nextInt();
    while(n>0){
        d=n%10;
        n=n/10;
        rev=rev*10+d;
    }
    System.out.println("Reverse :"+ rev);
    }
}

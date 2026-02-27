import java.util.*;
class Max{
   int n1,n2,n3;
    Max(int a,int b,int c){
        n1=a;
        n2=b;
        n3=c;
    }
    int Greatest(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>c &&b>a){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args){
        System.out.println("Enetr 3 numbers");
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        Max ob=new Max(n1,n2,n3);
        int store=ob.Greatest(n1,n2,n3);
        System.out.println("The Greatest of 3 is :"+ store);
    }
}

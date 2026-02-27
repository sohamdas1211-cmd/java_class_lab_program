public class OddEven {
    int num;
    void check(){
        if(num%2==0)
            System.out.println(num + "Is Even");
         else
            System.out.println(num + "Is Odd");
    }
    public static void main(String[]args){
        OddEven obj= new OddEven();
        obj.num=15;
        obj.check();
    }
}

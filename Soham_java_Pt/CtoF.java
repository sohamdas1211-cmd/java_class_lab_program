class CtoF{
    double c;
    void convert(){
        double f=(c*(9/5))+32;
        System.out.println("temperature in farenheit :"+f);
    }
    public static void main(String[]args)
    {
        CtoF obj = new CtoF();
        obj.c=37;
        obj.convert();
    }
}
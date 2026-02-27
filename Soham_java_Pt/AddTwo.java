class AddTwo{
    int a,b;
    AddTwo(int n1,int n2){
        a=n1;
        b=n2;
    }
    void add(){
        int sum=a + b;
        System.out.println("Sum="+sum);
    }
    public static void main(String[]args){
        AddTwo obj=new AddTwo(10,20);
        obj.add();
    }
}
public class Rectangle {
    double length,width;
    void calculate(){
        double area=length*width;
        double peri=2*(length+width);
        System.out.println("Area "+area);
        System.out.println("Perimeter "+peri);

    }
    public static void main(String[]args){
        Rectangle obj=new Rectangle();
        obj.length=20;
        obj.width=5;
        obj.calculate();
    }
    
}

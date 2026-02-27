public class Swap {

    int num;

    Swap(int n) {
        num = n;
    }

    public static void main(String[] args) {

        Swap obj1 = new Swap(10);
        Swap obj2 = new Swap(20);

        System.out.println("Before Swapping:");
        System.out.println(obj1.num + " " + obj2.num);

        int temp = obj1.num;
        obj1.num = obj2.num;
        obj2.num = temp;

        System.out.println("After Swapping:");
        System.out.println(obj1.num + " " + obj2.num);
    }
}

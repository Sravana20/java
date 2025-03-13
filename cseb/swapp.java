public class swapp{

    public static void main(String[]args){
        int a = 5;
        int b = 7;
        int temp;

        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        temp=a;
        a=b;
        b=temp;

        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


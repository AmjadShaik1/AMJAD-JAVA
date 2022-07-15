import java.util.Scanner;

public class GreatestOfTwo {
    public static int  GreatestNumber(int a,int b) {
        if(a>b) return a;
        else return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(GreatestNumber(a,b));
    }
}

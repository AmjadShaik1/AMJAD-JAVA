import java.util.Scanner;

public class TableOfNumber {
    public static void Mul_Table(int n ) {
        for (int i = 1; i <=10; i++) {
            System.out.println(n+"*"+i+"="+n*i);
            
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        Mul_Table(n);
    }
}

import java.util.Scanner;

public class PowOf2_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int n = sc.nextInt();
        int m=n-1;
        if((n & m)==0){
          System.out.println("Giveh Number is a power of 2");
        }else{
          System.out.println("Giveh Number is NOT a power of 2");
            
        }
    }
}

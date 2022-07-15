import java.util.Scanner;

public class AverageOf3 {
    public static float FindAvg(int a,int b,int c) {
        float avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println( FindAvg(a,b,c));
        }
    
}

import java.util.Scanner;

public class Circumference {
    public static float CircumferenceOfCircle(int r) {
       final float pi =3.14f;
       float circum= 2*pi*r;
       return circum;
        
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        int r = s.nextInt();
         System.out.println( CircumferenceOfCircle(r));

    }
    
}

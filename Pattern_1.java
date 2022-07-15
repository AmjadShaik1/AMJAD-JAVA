import java.util.*;;
public class Pattern_1 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int n = s.nextInt();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    }
    
}

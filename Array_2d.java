import java.util.Scanner;

public class Array_2d {

    public static void main(String[] args) {
        int m = 3, n = 5,k=87;
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[m][n];
        System.out.println("Enter Array elements:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] ==k){
                    System.out.println("Element Found at  location("+i+","+j+")");
                }
            }
        }
    }

}

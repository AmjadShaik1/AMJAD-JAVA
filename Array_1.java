import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =10;
        int x=83;
        int[] arr=new int [n];
        System.out.println("Enter Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                System.out.println("\n Element present at index  "+i);
            }
            else{
                continue;
            }
        }
    }
    
}

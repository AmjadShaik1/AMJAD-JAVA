public class Pattern_7 {
    public static void main(String[] args) {
        int n = 5;
        int p=1;
        for (int  i = 1; i <=n; i++) {
           for (int j = 0; j <=n-i; j++) {
            System.out.print(" ");
            
           }
           for (int j = 0; j <i; j++) {
            System.out.print(i+" ");
           }
           System.out.println();
        }
    }
}

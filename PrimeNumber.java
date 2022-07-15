import javax.sound.sampled.BooleanControl;

public class PrimeNumber {
    public static Boolean IsPrime(int n ) {
        for (int i = 2; i < n/2; i++) {
            if(n%i==0){
                return false;            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n =73;
       System.out.println(IsPrime(n));
    }
    
}

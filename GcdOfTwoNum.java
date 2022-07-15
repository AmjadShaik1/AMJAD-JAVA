public class GcdOfTwoNum {

    public static void main(String[] args) {
        int a=48;
        int b=36;
        int gcd = 1;
        if(a>b){
            for (int i = 1; i <=b; i++) {
                if(a%i==0&&b%i==0){
                    gcd=i;
                }
            }
        }
        else{
            for (int i = 1; i <=a; i++) {
                if(a%i==0&&b%i==0){
                    gcd=i;
                }
            }
        }
        System.out.println(gcd);
    }
    
}

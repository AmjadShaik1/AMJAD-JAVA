import java.util.Scanner;
public class DecToBinary {
    public static String convertToBinary(int n){
        String str="";
        while(n!=0){
        str=n%2+str;
        n=n/2;
        }
        
        System.out.println(str);
        return str;


    }

        public static void convertToDecimal(int n) {
                int decimal =0;
                int num=0;
                while (true) {
                    if(n==0){
                        break;
                    }else{
                        int temp=n%10;
                        decimal+=temp*Math.pow(2, num);
                        n=n/10;
                        num++;


                    }

                }
                System.out.println(decimal);
       
    }
    public static void count_0_1s(String str) {
        int zc=0,OneC=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='0'){
                zc++;

            }else{
                OneC++;
            }          
        }
        System.out.println("Number of zeros:"+zc);
        System.out.println("Number of ones:"+OneC);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num=sc.nextInt();
         String str= convertToBinary(num);
         count_0_1s(str);
         convertToDecimal(10101010);
    }
}

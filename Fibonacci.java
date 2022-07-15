public class Fibonacci {
    public static void Fibo(int n1,int n2,int c) {
c++;
        int n3=n1+n2;
        if(c>=20){
            return;
        }
        System.out.print(n3+" ");
        n1=n2;
        n2=n3;
        Fibo(n1, n2,c);
        
    }

    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int c=0;
System.out.print(n1+" "+n2+" ");
Fibo(n1, n2,c);
    }
    
}

import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        int  num = 5;

        int pos=2;
       //get bit
       int bitMask =1<<pos;
       if((bitMask & num)==0){
       System.out.println(" Bit was 0");
       }else{
        System.out.println("Bit was 1");
       }

       //set bit
       num=bitMask | num;
       System.out.println(num);

       //clear bit
       bitMask=~(bitMask);
       num=bitMask & num;
       System.out.println(num);

       //update bit
        Scanner sc = new Scanner(System.in);
        System.out.println("If you want to change the to 1 press 1 otherwise press 0: ");
        int choice=sc.nextInt();
        bitMask=1<<pos;
        if(choice==1){
            num=bitMask | num;
            System.out.println(num);

        }else{
            bitMask=~(bitMask);
            num=bitMask & num;
            System.out.println(num);
        }

       

    }
}

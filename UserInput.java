import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int pos=0,neg=0,zero=0;
        EnterNumber(pos,neg,zero);

    }
    public static void EnterNumber(int pos,int neg,int zero) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any NUmber: ");
        int num=sc.nextInt();
        if(num>0){
            pos++;
        }
        if(num==0){
            zero++;
        }
        if(num<0){
            neg++;
        }
        System.out.println("if you want to enter a number again press 1 else press 2: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                EnterNumber(pos, neg, zero);
                break;
            case 2:
               System.out.println("No of Positive :"+pos);
               System.out.println("No of negative :"+neg);
               System.out.println("No of zeros :"+zero);

                break;
            default:
                break;
        }
    }
   
}

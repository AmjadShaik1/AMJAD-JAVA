public class Vote {
public static void  IsEligible(int age) {
    if (age>=18){
        System.out.println("Eligible to Vote");
    }
    else{
        System.out.println("Not Eligible to Vote");
    }
    
}
public static void main(String[] args) {
    int age =18;
    IsEligible(age);
}
}

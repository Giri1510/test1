
import java.util.Scanner;

public class taskFive {

    public boolean primeNumber(int num){

        if(num<=1){
            return false;
        }
        if(num==2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        
        taskFive f5 = new taskFive();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to find is it prime number or not :");

        try {
            int num = s.nextInt();
            if (f5.primeNumber(num)) {
                System.out.println(num+" it is prime number");
            } else {
                System.out.println(num+" it is not prime number");
            }

            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entered Number is Invalid");
        }

    }
    
}


import java.util.Scanner;

public class taskFour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter you Number :");

        try {
            int input = s.nextInt();

            System.out.println("Enter your multiplication table limit: ");
            int limit = s.nextInt();
            if(limit>=1){
                for(int i = 1; i<=limit; i++){
                    System.out.println(input+"*"+i+"="+input *i);
                }
            }else{
                System.out.println("Please enter your limit greater than 0");
            }
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Enter valid integer value");
        }
    }
    
}

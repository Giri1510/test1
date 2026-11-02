
import java.util.Scanner;

public class scan {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int i = 0;
        do { 
                try {
                System.out.println("Enter a input : ");
                int num = s.nextInt();
                System.out.println("Correct :"+ num);
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Enter an Integer only:");
                s.nextLine();
            }
        } while (i < 10);
        System.out.println("Giri");             
    }
    
}

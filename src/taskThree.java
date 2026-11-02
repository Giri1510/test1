
import java.util.Scanner;

public class taskThree {
    public static void main(String[] args) {

       Scanner s = new Scanner(System.in);
       System.out.println("Enter the Numbers: ");

        try {
            int userInput = s.nextInt();
            System.out.println("User entered Number is : "+ userInput);

            // Odd or Even
            if(userInput%2 == 0 ){

                if(userInput > 0){
                    System.out.println("Its Even Number & Poitive Number");
                }else if(userInput < 0){
                    System.out.println("Its Even Number & Negative Number");
                }else if(userInput == 0){
                    System.out.println("Its Even Number & Zero");
                }
            }else if(userInput > 0){
                System.out.println("Its Odd Number & Postive Number");
            }else if(userInput < 0){
                    System.out.println("Its Odd Number & Negative Number");
            }

            // Multiplication
            for (int i = 1; i <= 10; i++) {
                System.out.println(userInput+"*"+ i +"="+ userInput*i);
            }

            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input : Enter only Integer values");
        }

    }
}

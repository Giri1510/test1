import java.util.Scanner;

public class taskSix {
    /*
        1. First generate random number and store that number in one variable
        2. Get input from user
        3. handle Guested number is low 
        4. handle Guested number is high 
        5. handle Guested number is Correct
        6. keep ask to input until find correct
        7. Display the count and entered amount 
        */    
    public void findNum(){
        int ramdomNum = (int)(Math.random()*100)+1;
        System.out.println("System Generated Number is : "+ ramdomNum);
        System.out.println("Enter a number to Find a Secret Number which is Mechine generated(Have Fun) : ");
        int count = 0;
        int Attempts = 0;
        int userInput ;
        Scanner s = new  Scanner(System.in);


        while (count < 7 && Attempts < 10) {
            try {
                userInput = s.nextInt();
                count++; // Count every valid integer guess, including a correct one

                if (userInput == ramdomNum) {
                    System.out.println(userInput + " is Correct! You won...!");
                    System.out.println("Number of Attempts to find secret number: " + count);
                    break;
                } else if (userInput > ramdomNum) {
                    System.out.println(userInput + " is Too High... try Again");
                } else {
                    System.out.println(userInput + " is Too Low... try Again");
                }

                if (count == 7) {
                    System.out.println("Maximum valid guesses reached! The Secret Number is: " + ramdomNum);
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Enter an Integer only:");
                s.nextLine(); // Discard invalid input
                Attempts++;

                System.out.println("You entered wrong input " + Attempts + " time(s). Valid guesses: " + count);

                if (Attempts == 10) {
                    System.out.println("10 invalid inputs entered... Bye!");
                }
            }
        }
                
        }
    public static void main(String[] args) {
        taskSix t6 = new taskSix();
        t6.findNum();
    }
}

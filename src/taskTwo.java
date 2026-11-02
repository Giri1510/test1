
import java.util.Scanner;

public class taskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Assume This is your calculator");
        try {
            System.out.println("Enter the First Value:");
            double userInput1 = sc.nextDouble();
                System.out.println("Enter your operator's ('+','-','*','/') any one of these");
                String operator = sc.next();
                System.out.println("Enter the Second Value:");
                double userInput2 = sc.nextDouble();
                        switch(operator){
                            case "+":
                                double result = userInput1 + userInput2;
                                if(result == Math.floor(result)){
                                    System.out.println(userInput1 +"+"+ userInput2 + " = " + (long)result);
                                }else{
                                System.out.println(userInput1 +"+"+ userInput2 + " = " + result);
                                }
                            break;

                            case "-":
                                double result1 = userInput1 - userInput2; 
                                if(result1 == Math.floor(result1)){
                                    System.out.println(userInput1 +"-"+ userInput2 + " = " + (long)result1);
                                }else{
                                    System.out.println(userInput1 +"-"+ userInput2 + " = " + result1);
                                }
                                break;

                            case "*":
                                double result2 = userInput1 * userInput2;
                                if(result2==Math.floor(result2)){
                                    System.out.println(userInput1 +"*"+ userInput2 + " = " + (long)result2);
                                }else{
                                    System.out.println(userInput1 +"*"+ userInput2 + " = " + result2);
                                }
                                break;

                            case "/":
                                if(userInput2 == 0){
                                   System.out.println("Cannot divide by zero");
                                }else{
                                     double result3 = userInput1 / userInput2;
                                    if(result3==Math.floor(result3)){
                                        
                                        System.out.println(userInput1 +"/"+ userInput2 + " = " + (long)result3);
                                    }else{
                                        
                                        System.out.println(userInput1 +"/"+ userInput2 + " = " + result3);
                                    }
                                }
                                break;
                            default:
                                System.out.println("Enter valid Operator");
                        }
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter valid numbers");
        }
    }
}

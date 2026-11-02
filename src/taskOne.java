
import java.text.DecimalFormat;
import java.util.Scanner;

public class taskOne {
    
    public void details(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your name: " );
        String userName = sc.nextLine();
        System.out.println("Enter Your Age: ");
        int userAge = sc.nextInt();
        System.out.println("Enter Your Height: ");
        double userHeight = sc.nextDouble();
        int afterAge = userAge + 5;
        boolean isAdult = userAge>=18;

        DecimalFormat f = new DecimalFormat("0.00");
        
        System.out.println("----Profile Details----");

        
        System.out.println("Name: "+ userName);
        System.out.println("Age: "+ userAge);
        System.out.println("Height: "+ f.format(userHeight));
        System.out.println("Age after five years: "+ afterAge);
        System.out.println("Adult: " + isAdult);

    }
    public static void main(String[] args) {
        
        taskOne ap = new taskOne();
        ap.details();
    }

}

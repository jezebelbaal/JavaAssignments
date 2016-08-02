/**
 * Created by jutsch on 7/29/16.
 */
import java.util.Scanner;

public class AssignmentsList {

    public static void main (String[] args){

        System.out.println("Start!");
        System.out.println("\nAssignment one:");
        System.out.println(firstAssignment());
        System.out.println("\nAssignment two:");
        System.out.println("Please, input a number.");

        Scanner scannerInput = new Scanner( System.in );
        String userInput = scannerInput.next();
        System.out.println(secondAssignment(Integer.parseInt(userInput)));

        System.out.println("\nAssignment three:");
        System.out.println("Please, input a number.");
        userInput = scannerInput.next();
        System.out.println(thirdAssignment(Integer.parseInt(userInput)));

    }

    public static String firstAssignment(){
        return "*";
    }

    public static String secondAssignment(int num){

        String output = "";
        for(int i = 0; i<num; i++){
            output = output + "*";
        }
        return output;
    }

    public static String thirdAssignment(int num){

        String output = "";
        for(int i = 0; i<num; i++){
            output = output + "*\n";
        }
        return output;
    }

    public void fourthAssignment(String[] args){
    }

    public void fifthAssignment(String[] args){
    }
}

/**
 * Created by jutsch on 7/29/16.
 */
import java.util.Scanner;

public class AsteriskWriter {

    public static void main (String[] args){

        System.out.println("Start!");
        System.out.println("\nAssignment one:");
        System.out.println(printSingleAsterisk());
        System.out.println("\nAssignment two:");
        System.out.println("Please, input a number.");

        Scanner scannerInput = new Scanner( System.in );
        String userInput = scannerInput.next();
        System.out.println(printAsteriksLine(Integer.parseInt(userInput)));

        System.out.println("\nAssignment three:");
        System.out.println("Please, input a number.");
        userInput = scannerInput.next();
        System.out.println(printAsterisksColumn(Integer.parseInt(userInput)));

        System.out.println("\nAssignment four:");
        System.out.println("Please, input a number.");
        userInput = scannerInput.next();
        System.out.println(printAsteriksTriangle(Integer.parseInt(userInput)));

    }

    public static String printSingleAsterisk(){
        return "*";
    }

    public static String printAsteriksLine(int num){

        String output = "";
        for(int i = 0; i<num; i++){
            output = output + "*";
        }
        return output;
    }

    public static String printAsterisksColumn(int num){

        String output = "";
        for(int i = 0; i<num; i++){
            output = output + "*\n";
        }
        return output;
    }

    public static String printAsteriksTriangle(int num){

        String output = "";
        String lines = "";
        for(int j = 0; j<num; j++){
            output = output + "*";
            lines = lines + output + "\n";
        }
        return lines;
    }

}

import java.util.Scanner;

/**
 * Created by jutsch on 8/5/16.
 */
public class FizzBuzzWriter {

    public static void main (String[] args){

        Scanner scannerInput = new Scanner( System.in );

        System.out.println("FizzBuzz generator!");
        System.out.println("\nPlease input a number:");
        String userInput = scannerInput.next();
        System.out.println("FizzBuzz sequence:");
        System.out.println(generate(Integer.parseInt(userInput)));
    }

    public static String generate(int num) {

        String output = "";
        String line;

        for (int i=1; i <= num; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    line = "FizzBuzz";
                } else {
                    line = "Fizz";
                }
            } else {
                if (i % 5 == 0) {
                    line = "Buzz";
                } else {
                    line = String.valueOf(i);
                }
            }
            if (i != num) {
                line = line + "\n";
            }
            output = output + line;
        }

        return output;
    }
}

/**
 * Created by jutsch on 8/2/16.
 */
import java.util.Scanner;

public class DiamondAssignments {

    public static void main (String[] args){

        Scanner scannerInput = new Scanner( System.in );

        System.out.println("Start!");
        System.out.println("\nAssignment one:");
        String userInput = scannerInput.next();
        System.out.println(drawPyramid(Integer.parseInt(userInput)));
        System.out.println("\nAssignment two:");
        System.out.println("Please, input a number.");


        userInput = scannerInput.next();
        System.out.println(drawFullDiamond(Integer.parseInt(userInput)));

        System.out.println("\nAssignment three:");
        System.out.println("Please, input a number.");
        userInput = scannerInput.next();
        System.out.println(drawNameDiamond(Integer.parseInt(userInput)));

    }

    public static String drawPyramid(int num){

        int max = num*2-1;
        int starsNum = 0;
        int shiftNum = 0;
        String lines = "";

        for (int i=1; i<=num; i++){

            starsNum = i*2-1;
            shiftNum = (max - starsNum)/2;

            String shift = new String(new char[shiftNum]).replace("\0", " ");
            String stars = new String(new char[starsNum]).replace("\0", "*");

            lines = lines + shift + stars + shift;

            if(shiftNum != 0){
                lines = lines + "\n";
            }
        }
        return lines;
    }

    public static String drawFullDiamond(int num){

        int max = num*2-1;
        int starsNum = 0;
        int shiftNum = 0;
        String lines = "";
        String shift = "";
        String stars = "";

        for (int i=1; i<=num; i++) {

            starsNum = i * 2 - 1;
            shiftNum = (max - starsNum) / 2;

            shift = new String(new char[shiftNum]).replace("\0", " ");
            stars = new String(new char[starsNum]).replace("\0", "*");

            lines = lines + shift + stars + shift + "\n";
        }

        for (int j = 1; j<num; j++){

            starsNum -=2;
            shiftNum ++;
            shift = new String(new char[shiftNum]).replace("\0", " ");
            stars = new String(new char[starsNum]).replace("\0", "*");
            lines = lines + shift + stars + shift;

            if(starsNum>1){
                lines = lines + "\n";
            }
        }

        return lines;
    }

    public static String drawNameDiamond(int num){

     int max = num*2-1;
        int starsNum = 0;
        int shiftNum = 0;
        String lines = "";
        String shift = "";
        String stars = "";
        String name = "Jullie";

        for (int i=1; i<=num; i++){

            starsNum = i*2-1;
            shiftNum = (max - starsNum)/2;

            shift = new String(new char[shiftNum]).replace("\0", " ");
            stars = new String(new char[starsNum]).replace("\0", "*");

            if(shiftNum==0){

                lines = lines + name + "\n";

            }else{
                lines = lines + shift + stars + shift + "\n";
            }
        }

        for (int j=1; j<num; j++){

            starsNum -=2;
            shiftNum ++;
            shift = new String(new char[shiftNum]).replace("\0", " ");
            stars = new String(new char[starsNum]).replace("\0", "*");
            lines = lines + shift + stars + shift;

            if(starsNum>1){
                lines = lines + "\n";
            }
        }

        return lines;
    }

}

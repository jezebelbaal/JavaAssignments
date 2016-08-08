/**
 * Created by jutsch on 8/5/16.
 */
public class PrimeFactorsWriter {

    public static Boolean isPrime(int num){

        for(int i = 2; i<=num; i++){
            if(num%i==0 && i!=num && num!=2){
                return false;
            }
        }
        return true;
    }

    public static String generateList(int num){

        String primeList = "";

        for(int i = 1; i<=num; i++){
           if(isPrime(i)){
               primeList = primeList + String.valueOf(i);
               if(i != num){
                   primeList = primeList + "\n";
               }
           }
        }

        return primeList;
    }
}

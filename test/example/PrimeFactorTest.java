import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrimeFactorTest {

    @Test
    public void receivesSevenTellsIfIsPrime() throws Exception{

        PrimeFactorsWriter primeFactors = new PrimeFactorsWriter();
        assertEquals(primeFactors.isPrime(7), true);
    }

    @Test
    public void receivesTwoTellsIfIsPrime() throws Exception{

        PrimeFactorsWriter primeFactors = new PrimeFactorsWriter();
        assertEquals(primeFactors.isPrime(2), true);
    }

    @Test
    public void receivesSixTellsIfIsPrime() throws Exception{

        PrimeFactorsWriter primeFactors = new PrimeFactorsWriter();
        assertEquals(primeFactors.isPrime(6), false);
    }

    @Test
    public void receivesThirtyAndReturnsPrimeFactors() throws Exception{

        PrimeFactorsWriter primeFactor = new PrimeFactorsWriter();
        assertEquals(primeFactor.generateList(30), "2, 3, 5");
    }

}

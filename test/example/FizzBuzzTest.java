import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void receivesIntFifteenReturnsFizzBuzzSequence() throws Exception {
        FizzBuzzWriter fizzbuzz = new FizzBuzzWriter();
        assertEquals(fizzbuzz.generate(15), "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz");
    }

    @Test
    public void receivesZeroReturnsFizzBuzzSequence() throws Exception {
        FizzBuzzWriter fizzbuzz = new FizzBuzzWriter();
        assertEquals(fizzbuzz.generate(0), "");
    }
}
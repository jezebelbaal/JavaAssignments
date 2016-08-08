import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AsteriskWriterTest {

    @Test
    public void firstAssignment() throws Exception {
        AsteriskWriter list1 = new AsteriskWriter();
        assertEquals(list1.printSingleAsterisk(), "*");
    }

    @Test
    public void secondAssignment() throws Exception {
        AsteriskWriter list2 = new AsteriskWriter();
        assertEquals(list2.printAsteriksLine(2), "**");
        assertEquals(list2.printAsteriksLine(3), "***");
        assertEquals(list2.printAsteriksLine(30), "******************************");
    }

    @Test
    public void thirdAssignment() throws Exception{
        AsteriskWriter list3 = new AsteriskWriter();
        assertEquals(list3.printAsterisksColumn(2), "*\n*\n");
        assertEquals(list3.printAsterisksColumn(3), "*\n*\n*\n");
        assertEquals(list3.printAsterisksColumn(30), "*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n");
    }

    @Test
    public void fourthAssignment() throws Exception{
        AsteriskWriter list4 = new AsteriskWriter();
        assertEquals(list4.printAsteriksTriangle(4), "*\n**\n***\n****\n");
    }

}
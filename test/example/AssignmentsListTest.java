import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AssignmentsListTest {

    @Test
    public void firstAssignment() throws Exception {
        AsteriskWriter list1 = new AsteriskWriter();
        assertEquals(list1.firstAssignment(), "*");
    }

    @Test
    public void secondAssignment() throws Exception {
        AsteriskWriter list2 = new AsteriskWriter();
        assertEquals(list2.secondAssignment(2), "**");
        assertEquals(list2.secondAssignment(3), "***");
        assertEquals(list2.secondAssignment(30), "******************************");
    }

    @Test
    public void thirdAssignment() throws Exception{
        AsteriskWriter list3 = new AsteriskWriter();
        assertEquals(list3.thirdAssignment(2), "*\n*\n");
        assertEquals(list3.thirdAssignment(3), "*\n*\n*\n");
        assertEquals(list3.thirdAssignment(30), "*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n");
    }

    @Test
    public void fourthAssignment() throws Exception{
        AsteriskWriter list4 = new AsteriskWriter();
        assertEquals(list4.fourthAssignment(4), "*\n**\n***\n****\n");
    }

}
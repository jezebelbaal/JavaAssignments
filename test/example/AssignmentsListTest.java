import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by jutsch on 7/29/16.
 */
public class AssignmentsListTest {

    @Test
    public void firstAssignment() throws Exception {
        AssignmentsList list1 = new AssignmentsList();
        assertEquals(list1.firstAssignment(), "*");
    }

    @Test
    public void secondAssignment() throws Exception {
        AssignmentsList list2 = new AssignmentsList();
        assertEquals(list2.secondAssignment(2), "**");
        assertEquals(list2.secondAssignment(3), "***");
        assertEquals(list2.secondAssignment(30), "******************************");
    }

    @Test
    public void thirdAssignment() throws Exception{
        AssignmentsList list3 = new AssignmentsList();
        assertEquals(list3.thirdAssignment(2), "*\n*\n");
        assertEquals(list3.thirdAssignment(3), "*\n*\n*\n");
        assertEquals(list3.thirdAssignment(30), "*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n");


    }

    @Test
    public void fourthAssignment() throws Exception{
        AssignmentsList list4 = new AssignmentsList();
        assertEquals(list4.fourthAssignment(4), "*\n**\n***\n****\n");
    }

}
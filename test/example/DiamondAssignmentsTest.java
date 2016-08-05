import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by jutsch on 8/2/16.
 */
public class DiamondAssignmentsTest {

    @Test
    public void firstAssignment() throws Exception {
        DiamondAssignments list1 = new DiamondAssignments();
        assertEquals(list1.firstAssignment(3), "  *  \n *** \n*****");
    }

    public void secondAssignment() throws Exception {
        DiamondAssignments list2 = new DiamondAssignments();
        assertEquals(list2.secondAssignment(3), "  *  \n *** \n*****\n *** \n  *  ");
    }

    public void thirdAssignment() throws Exception {
        DiamondAssignments list3 = new DiamondAssignments();
        assertEquals(list3.thirdAssignment(3), "  *  \n *** \nJullie\n *** \n  *  ");
    }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jutsch on 8/2/16.
 */
public class DiamondAssignmentsTest {

    @Test
    public void firstAssignment() throws Exception {
        DiamondAssignments list1 = new DiamondAssignments();
        assertEquals(list1.drawPyramid(3), "  *  \n *** \n*****");
    }

    @Test
    public void secondAssignment() throws Exception {
        DiamondAssignments list2 = new DiamondAssignments();
        assertEquals(list2.drawFullDiamond(3), "  *  \n *** \n*****\n *** \n  *  ");
    }

    @Test
    public void thirdAssignment() throws Exception {
        DiamondAssignments list3 = new DiamondAssignments();
        assertEquals(list3.drawNameDiamond(3), "  *  \n *** \nJullie\n *** \n  *  ");
    }
}

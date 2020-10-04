package MaximumProblem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MaxTest {
	MaxMain maxMainObj;
	
	public MaxTest()
	{
		maxMainObj = new MaxMain();
	}
	
	@Test public void Test_Max_at_Position1() {       
        assertEquals(new Integer(3), maxMainObj.FindMaximum(3,2,1));
    }
	
	@Test public void Test_Max_at_Position2() {       
        assertEquals(new Integer(3), maxMainObj.FindMaximum(2,3,1));
    }
	
	@Test public void Test_Max_at_Position3() {       
        assertEquals(new Integer(3), maxMainObj.FindMaximum(1,2,3));
    }

}

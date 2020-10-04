package MaximumProblem;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MaxTest {
	MaxMain maxMainObj;
	
	@Test public void Generic_Test_Max() {       
  assertEquals(new Integer(3), new MaxMain(2,3,1).FindMaximum());
}
	
	public MaxTest()
	{
		maxMainObj = new MaxMain();
	}
	
	@Test public void Integer_Test_Max_at_Position1() {       
        assertEquals(new Integer(3), maxMainObj.FindMaximum(3,2,1));
    }
	
	@Test public void Integer_Test_Max_at_Position2() {       
        assertEquals(new Integer(3), maxMainObj.FindMaximum(2,3,1));
    }
	
	@Test public void Integer_Test_Max_at_Position3() {       
        assertEquals(new Integer(3), maxMainObj.FindMaximum(1,2,3));
    }
	
	@Test public void Float_Test_Max_at_Position1() {       
        assertEquals(new Float(3), maxMainObj.FindMaximum(3f,2f,1f));
    }
	
	@Test public void Float_Test_Max_at_Position2() {       
        assertEquals(new Float(3), maxMainObj.FindMaximum(2f,3f,1f));
    }
	
	@Test public void Float_Test_Max_at_Position3() {       
        assertEquals(new Float(3), maxMainObj.FindMaximum(1f,2f,3f));
    }
	
	@Test public void String_Test_Max_at_Position1() {       
        assertEquals("Peach", maxMainObj.FindMaximum("Peach","Banana","Apple"));
    }
	
	@Test public void String_Test_Max_at_Position2() {       
        assertEquals("Peach", maxMainObj.FindMaximum("Banana","Peach","Apple"));
    }
	
	@Test public void String_Test_Max_at_Position3() {       
        assertEquals("Peach", maxMainObj.FindMaximum("Apple","Banana","Peach"));
    }

}

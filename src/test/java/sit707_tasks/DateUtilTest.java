package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s223148345";
		Assert.assertNotNull("Student ID is ", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Bharat Bhatt";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	// D1 is test cases for Days between 1 to 28 //

	@Test
    public void testD1Janf15ShouldIncrementToJan16() {
        DateUtil date = new DateUtil(15, 1, 2024);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(16, date.getDay());
    }
    
    @Test
    public void testD1Jan18ShouldDecrementToJan17() {
        DateUtil date = new DateUtil(18, 1, 2024);    
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(17, date.getDay());
        Assert.assertEquals(1, date.getMonth());
    }
    
    // D2 is test cases for Day 29 //
    
    @Test
    public void testD2Feb29ShouldIncrementToMar1() {
        DateUtil date = new DateUtil(29, 2, 2024);      
        date.increment();
        System.out.println(date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }
    
    @Test
    public void testD2Feb2918ShouldDecrementToFeb28() {
        DateUtil date = new DateUtil(29, 2, 2024);    
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }
    
    // D3 is test cases for Day 30 //
    
    @Test
    public void testD3June30ShouldIncrementToJuly1() {
        DateUtil date = new DateUtil(30, 6, 2024);     
        date.increment();
        System.out.println(date);
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }
    
    @Test
    public void testD3June30ShouldDecrementToJune29() {
        DateUtil date = new DateUtil(30, 6, 2024);     
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(6, date.getMonth());
    }
    
    // D4 is test cases for Day 31 //
    
    @Test
    public void testD4May31ShouldIncrementToJune1() {
        DateUtil date = new DateUtil(31, 5, 2024);    
        date.increment();
        System.out.println(date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }
    
    @Test
    public void testD4May30ShouldDecrementToMay29() {
        DateUtil date = new DateUtil(30, 5, 2024);   
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(5, date.getMonth());
    }
    
    // M1 is test cases for Months having 30 days //
    
    @Test
    public void testM1Nov10ShouldIncrementToNov11() {
        DateUtil date = new DateUtil(10, 11, 2024);   
        date.increment();
        System.out.println(date);
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(11, date.getDay());
    }
    
    @Test
    public void testM1Nov20ShouldDecrementToNov19() {
        DateUtil date = new DateUtil(20, 11, 2024);       
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(19, date.getDay());
        Assert.assertEquals(11, date.getMonth());
    }
    
    // M2 is test cases for Months having 31 days //
    
    @Test
    public void testM2Dec28ShouldIncrementToDec29() {
        DateUtil date = new DateUtil(28, 12, 2024);      
        date.increment();
        System.out.println(date);
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(29, date.getDay());
    }
    
    @Test
    public void testM2Dec15ShouldDecrementToDec14() {
        DateUtil date = new DateUtil(15, 12, 2024);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(14, date.getDay());
        Assert.assertEquals(12, date.getMonth());
    }
    
    // M3 is test cases for February //
    
    @Test
    public void testM3Feb24ShouldIncrementToFeb25() {
        DateUtil date = new DateUtil(24, 2, 2024);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(25, date.getDay());
    }
    
    @Test
    public void testM3Feb18ShouldDecrementToFeb17() {
        DateUtil date = new DateUtil(18, 2, 2024);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(17, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }
    
    // Y1 is test cases for Leap Year //
    
    @Test
    public void testY1Feb28ShouldIncrementToFeb29() {
        DateUtil date = new DateUtil(28, 2, 2020);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(29, date.getDay());
    }
    
    @Test
    public void testY1Feb29ShouldDecrementToFeb28() {
        DateUtil date = new DateUtil(29, 2, 2020);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }
    
    // Y2 is test cases for non-leap year //
    
    @Test
    public void testY2Feb28ShouldIncrementToMar1() {
        DateUtil date = new DateUtil(28, 2, 2021);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }
    
    @Test
    public void testY2Mar1ShouldDecrementToFeb28() {
        DateUtil date = new DateUtil(1, 3, 2021);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
    }
}
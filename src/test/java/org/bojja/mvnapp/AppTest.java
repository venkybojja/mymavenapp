package org.bojja.mvnapp;

import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        //assertTrue( true );
		String message="Test assert";
		System.out.println("shouldAnswerWithTrue:"+message);
		Assert.assertEquals(message,new App().printMessage(message+" fail"));
		System.out.println("shouldAnswerWithTrue:Assert completed");
		
    }
}

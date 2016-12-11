package test.basic.helloworld;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUnit_Failure {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
	   message = "Namaste India";
      assertEquals(message,messageUtil.printMessage());
   }
}
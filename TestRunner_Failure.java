package test.basic.helloworld;
import org.junit.runner.JUnitCore;
	import org.junit.runner.Result;
	import org.junit.runner.notification.Failure;

	public class TestRunner_Failure {
	   public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(TestUnit_Failure.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }
	}  

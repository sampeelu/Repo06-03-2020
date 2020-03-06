import org.jira.jira_api.BaseClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Customer extends BaseClass {
	
	@Test
	public void createCustomerTest(){
		com.relevantcodes.extentreports.ExtentTest test = report.startTest("createCustomerTest");
		test.log(LogStatus.INFO, "navigate to task page");
		report.endTest(test);
	}
	@Test
	public void modifyCustomerTest(){
		com.relevantcodes.extentreports.ExtentTest test = report.startTest("modifyCustomerTest");
		test.log(LogStatus.INFO, "modifyCustomer to task page");
		report.endTest(test);
		
	}
	
	@Test
	public void deleteCustomerTest(){
		com.relevantcodes.extentreports.ExtentTest test = report.startTest("deleteCustomerTest");
		
		report.endTest(test);
		
	}
	

}

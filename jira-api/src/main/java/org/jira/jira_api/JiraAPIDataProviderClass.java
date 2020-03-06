package org.jira.jira_api;

import org.testng.annotations.DataProvider;

public class JiraAPIDataProviderClass {

	@DataProvider(name="createBugTests")
	public static Object[][] createBugTests(){
		return new Object[][]{
			{"","",""},
			
		};
	}
	
	
}

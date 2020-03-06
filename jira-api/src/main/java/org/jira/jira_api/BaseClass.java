package org.jira.jira_api;
import java.io.File;
import java.util.Date;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReporter.*;
import com.relevantcodes.extentreports.ExtentReports;
public class BaseClass {
	
	public ExtentReports report;
	
	@BeforeSuite
	public void conficBS(){
		String currentDate = new Date().toString().replace("","_").replace(":", "_");
		System.out.println(currentDate);

		report = new ExtentReports("./advanceReport/"+currentDate+"_extent.html");
		
		report.loadConfig(new File("./extent.config.xml"));
	}
	
	@AfterSuite
	public void configAS(){
		report.flush();
		report.close();

	}
}

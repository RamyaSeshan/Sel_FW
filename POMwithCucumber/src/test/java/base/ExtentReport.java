package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) {

		
		ExtentHtmlReporter repo=new ExtentHtmlReporter("./report/report.html");
		
		repo.setAppendExisting(true); 
		ExtentReports extent =new ExtentReports();
		
		extent.attachReporter(repo);
		
		ExtentTest test=extent.createTest("CreateLead", "leaftap apllication");
		test.assignAuthor("Dilip");
		test.assignCategory("sanity");
		
		test.pass("username");
		test.pass("password");
		
	extent.flush();
	}

}

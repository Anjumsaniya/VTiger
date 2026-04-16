package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {
	
	
	ExtentReports reports;
	ExtentTest test;
	JavaUtility jutil = new JavaUtility();
	String dateTimeStamp = jutil.getCalenderDetails("dd-MM-YYYY hh-mm-ss");
	
	

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"--On Test Start executed");
		
		//Creating fields for every @Test method in the report
		test = reports.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"--On Test Success executed");
		//Logging the status as PASS for test method
		test.log(Status.PASS,methodName+"--successfully executed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"--On Test Failure executed");
		//Logging the status as Fail
		test.log(Status.FAIL,methodName+"--failed");
		test.log(Status.INFO,result.getThrowable());

		
		

    //Capturing the screenshot of the webpage
		String screenshotName = methodName+"-"+dateTimeStamp;
		
		
		SeleniumUtility sutil = new SeleniumUtility();
		
			try {
				
				String path = sutil.webpageScreenshot(BaseClass.sDriver, screenshotName);
				//Attaching the screenshot to the failed test in report
				test.addScreenCaptureFromPath(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		
				
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"--On Test Skipped executed");
		
		//Logging the status as SKIP
		test.log(Status.SKIP,methodName+"--skipped");
			

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		String methodName = result.getMethod().getMethodName();

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String methodName = result.getMethod().getMethodName();

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Test Start executed");
		
		//Configure the Extent Report
		ExtentSparkReporter reporter = new ExtentSparkReporter(".\\Extent_Reports\\report-"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("Extent Report");
		reporter.config().setReportName("VTiger Report");
		reporter.config().setTheme(Theme.STANDARD);
		
		
		//Generate an empty report
		
		reports = new  ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Base URL", "http://host:8888");
		reports.setSystemInfo("Base browser", "chrome");
		reports.setSystemInfo("Base Platform", "Windows");
		reports.setSystemInfo("Test Engineer", "Khans");


	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish executed");
		//Flushing the report
		reports.flush();
	}
	
	

}

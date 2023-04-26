package testngdisc;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners extends TestClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case "+result.getName()+" started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case "+result.getName()+" has passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case "+result.getName()+" has failed");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		
		String path = System.getProperty("user.dir")+"//screenshottts//"+result.getName()+".png";
		
		File file = new File(path);
		
		try {
			FileHandler.copy(screenshot, file);
		} catch (IOException e) {
			System.out.println("Exception arrived while taking the screenshot");
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case "+result.getName()+" has skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test tag "+context.getName()+" has started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test tag "+context.getName()+" has finished");
	}
	
	

}

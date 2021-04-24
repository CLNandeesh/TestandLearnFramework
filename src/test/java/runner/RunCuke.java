package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = { "json:target/RunCuke/cucumber.json", "pretty", "html:target/RunCuke/cucumber.html",
		"com.cucumber.listener.ExtentCucumberFormatter" }, features = "src/test/resources/features", glue = "steps",
		/* tags = {"@login","@flow"} , */
		monochrome = true)

public class RunCuke extends AbstractTestNGCucumberTests {

	@BeforeClass
	public static void setup() {
		// Initiates the extent report and generates the output in the
		// output/Run_<unique timestamp>/report.html file by default.
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		// String fileName = System.getProperty("user.dir")+"\\target\\Extent_Reports\\"
		// + strDate+".html";

		String fileName = System.getProperty("user.dir") + "\\target\\Extent_Reports\\" + "Test and Learn Automation Test Report"
				+ ".html";
		File newFile = new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile, false);
		// static report name
		// ExtentCucumberFormatter.initiateExtentCucumberFormatter(new
		// File("F:\\cucumber-testing-master\\ExtenReports\\extentreports.html"),false);
		// Loads the extent config xml to customize on the report.
		ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));

		// User can add the system information as follows
		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
		ExtentCucumberFormatter.addSystemInfo("Tester", "Induja");
		ExtentCucumberFormatter.addSystemInfo("Instance ", "Development");

		// Also you can add system information using a hash map
		Map systemInfo = new HashMap();
		systemInfo.put("Automation Framework", "Cucumber BDD");
		// systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
		ExtentCucumberFormatter.addSystemInfo(systemInfo);
	}

}

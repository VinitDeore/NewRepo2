package com.qmetry.qaf.example;

import org.openqa.selenium.Capabilities;

import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandAdapter;

public class DriverListener extends QAFWebDriverCommandAdapter{

	@Override
	public void beforeInitialize(Capabilities desiredCapabilities) {
	
		super.beforeInitialize(desiredCapabilities);
		
//		System.out.println("Testing");
//		System.setProperty("extent.reporter.html.start", "true");
//		System.setProperty("extent.reporter.html.out", "target/extent/extent-cucumber-report.html");
//		System.setProperty("screenshot.dir", "target/extent/img/");
	}
	
}
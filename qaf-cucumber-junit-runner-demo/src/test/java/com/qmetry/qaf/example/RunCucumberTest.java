package com.qmetry.qaf.example;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "scenarios/suite1.feature", glue = "com.qmetry.qaf.example.steps", plugin = {
		"com.qmetry.qaf.automation.cucumber.QAFCucumberPlugin",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty", "html:target/extentreports",
		"json:target/reports/cucumber.json" }, monochrome = true)
public class RunCucumberTest {
	@BeforeClass
	public static void setup() {
		System.out.println("Testing");
		System.setProperty("extent.reporter.html.start", "true");
		System.setProperty("extent.reporter.html.out", "target/extent/extent-cucumber-report.html");
		System.setProperty("screenshot.dir", "target/extent/img/");
	}
}
package org.testingworld.automation.testcase;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "pretty", "html:target/cucumber-htmlreport", "json-pretty:target/cucumber-report.json"},
		features = {"src/test/java"},
		dryRun = false,
		monochrome = true)

public class RunCukesTest {

}

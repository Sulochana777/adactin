package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.MavenCucumberProject.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature\\adactindemo.feature",
glue="com.adactin.stepdefinition")
public class Runner_demo {
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\MavenCucumberProject\\src\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		//driver= BaseClass.getdriver("chrome");
	}
		
	
	@AfterClass
	public static void tearsDown () {
		driver.close();

}
}

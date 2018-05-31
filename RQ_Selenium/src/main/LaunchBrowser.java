package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		String KEY = "webdriver.chrome.driver";
		String VALUE = "./software/chromedriver.exe";
		
		System.setProperty(KEY, VALUE);
		driver = new ChromeDriver();
		
	}

}

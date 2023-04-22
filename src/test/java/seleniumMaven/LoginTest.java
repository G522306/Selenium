package seleniumMaven;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LoginTest {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver Driver = new FirefoxDriver();
		
		Driver.get("https://www.fareye.co/v2");
		Driver.findElement(By.name("username")).click();
	}

}

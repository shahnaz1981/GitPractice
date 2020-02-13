package Com.Maven;
import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest2 {
	
	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohamed .LAPTOP-QCE4AIJL\\eclipse-workspace\\MavenDemo\\src\\main\\java\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
//		 driver.get("https://www.cnn.com/");
		driver.get("https://www.fedex.com/en-lr/home.html");
		
		
		
		
		
	}

}

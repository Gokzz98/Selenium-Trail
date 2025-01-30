package seleniumworkspace; 
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Basics {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://multitrayqa.flatworldinfotech.com/");
		driver.findElement(By.className("form-control")).sendKeys("suma.mr@flatworldsolutions.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Suma@1234");
		driver.findElement(By.cssSelector("button.btn")).click();
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10,TimeUnit.SECONDS)));
		
		driver.quit();
		
		
	}

}

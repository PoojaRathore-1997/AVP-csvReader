package Face1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe"); 
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='u_0_j_pz']")).sendKeys("Pooja");
		driver.findElement(By.xpath("//input[@id='u_0_l_9R']")).sendKeys("Rathore");
		

	}

}

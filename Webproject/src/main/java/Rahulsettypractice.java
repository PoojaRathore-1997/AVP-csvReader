import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahulsettypractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/practice-project");
	driver.findElement(By.xpath("//input[@placeholder=\"Your Name*\"]")).sendKeys("Pooja");
	driver.findElement(By.xpath("//input[@placeholder=\"Your Email*\"]")).sendKeys("pr2715384@gmail.com");
	//Checkbox//
	driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
	Thread.sleep(3000);
	//submit//
	driver.findElement(By.xpath("//button[@id=\"form-submit\"]")).click();
	//practice link//
	driver.findElement(By.xpath("/html/body/div/section[1]/div/section/div/div[1]/a[1]")).click();
	}

}

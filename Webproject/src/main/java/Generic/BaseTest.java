package Generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConst {

	public WebDriver driver;
	static {
		System.setProperty(CHROME_KEY,CHROME_VALUE);
	}
	@BeforeMethod
	public void Openapplication() {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("...disable-notification");
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(ITO, TimeUnit,SECONDS);
	    driver.get(URL);
	}

}

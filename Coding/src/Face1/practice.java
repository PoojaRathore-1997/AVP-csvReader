package Face1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice
{
	public static void main(String[] args) throws InterruptedException  
	{

//       
        	System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
    		ChromeDriver driver = new ChromeDriver();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(3));
    		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
    		//driver.get("https://www.google.com/");
    		//driver.get("https://avp-league-management.herokuapp.com/");
    		driver.get("https://promoter.applination.in/");
    		Thread.sleep(2000);
    		driver.manage().window().maximize();
    		
    		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashishgargvdoit@gmail.com");
    		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.TAB);

    		Thread.sleep(1000);
    		//driver.findElement(By.xpath("//input[@name='password'")).click();
    		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
    		driver.findElement(By.cssSelector(".LoginButton")).click();
    		Thread.sleep(2000);
    		//driver.get("https://promoter.applination.in/TemplateDivisionSavedMain/7668");
    		driver.navigate().to("https://promoter.applination.in/DashboardEvents");
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("window.scrollBy(0,800)", "");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[3]/div/div[3]/div/div/div[2]/hr")).click();
    		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[3]/div/div[3]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]")).click();
    		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/nav/div/div/ul[1]/li[2]")).click();
    		//Hamburger
    		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/a/div/img")).click();
    		Thread.sleep(1500);
    		//View Division
    		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/a/div/span/ul/li[3]")).click();
    		//Dropdown
    		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/div[3]/img")).click();
    		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/div/img")).click();
    		Thread.sleep(1500);
    		//Generate Schedule
    		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/div/span/ul/li[2]")).click();
    		//Left Arrow
    		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/nav/div/div/ul[1]/li")).click();
    		Thread.sleep(1500);
    		//Hamburger
    		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/a/div/img")).click();
    		Thread.sleep(1500);
    		//Close Registration
    		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/a/div/span/ul/li[6]")).click();
    		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/button[6]/span")).click();
    		js.executeScript("window.scrollBy(0,800)", "");
   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[3]/div/div[1]/div[1]/span/img")).click();
    	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div/div[1]/div[2]")).click();	
    	//scores//
    	driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/button[6]/span")).click();
    	//edit//
    	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/span/ul/li")).click();
    	//scores filling//
    	
    	Thread.sleep(80000);
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
//    		//Dropdown
//    		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/div[3]/img")).click();
//    		Thread.sleep(1000);
//    		//Hamburger
//    		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/div/img")).click();
//    		Thread.sleep(1000);
//    		//Generate Schedule
//    		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/div/span/ul/li[2]")).click();
////    		//Left Arrow Key on Top Navbar
////    		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/nav/div/div/ul[1]/li")).click();
//    		
//    		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/nav/div/div/ul[1]/li[1]")).click();
    	//Bracket Page
    	// Actions a = new Actions(driver);
    	// Draggable Or Source
    	//WebElement source= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div[2]/div[1]"));
    	WebElement source1= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[2]/div[2]/div[2]"));
    	// Droppable Or Destination
    	//WebElement target= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[2]/div[2]/div[1]"));
    	WebElement target1= driver.findElement(By.xpath("#/html/body/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[2]/div[2]/div[2]"));
    	Thread.sleep(2000);
    	// a.dragAndDrop(source, target).build().perform();
    	// ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", target);

    	org.openqa.selenium.Point coordinates = source1.getLocation();
    	Robot robot = new Robot();
    	robot.mouseMove(coordinates.getX()+20,coordinates.getY()+30);

    	// Actions builder = new Actions(driver);
    	// Action dragAnddrop = builder.clickAndHold(source)
    	// .moveToElement(target)
    	// .release(target)
    	// .build();
    	// dragAnddrop.perform();

    	// JavascriptExecutor js = (JavascriptExecutor)driver;
    	// js.executeScript("window.scrollBy(0,250)");
    	// js.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
    	// + "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n"
    	// + "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
    	// + "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n"
    	// + "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
    	// + "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
    	// + "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
    	// + "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n"
    	// + "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
    	// + "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n"
    	// + "var dropEvent = createEvent('drop');\n"
    	// + "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
    	// + "var dragEndEvent = createEvent('dragend');\n"
    	// + "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
    	// + "var source = arguments[0];\n" + "var destination = arguments[1];\n"
    	// + "simulateHTML5DragAndDrop(source,destination);", source, target);



    	// int x = target.getLocation().x;
    	// int y = target.getLocation().y;

    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", target);



    	Actions actions = new Actions(driver);
    	actions.moveToElement(source1)
    	.pause(Duration.ofSeconds(1))
    	.clickAndHold(source1)
    	// .pause(Duration.ofSeconds(1))
    	.moveByOffset(0, -200)
    	.moveToElement(target)
    	// .moveByOffset(0,-50)
    	.pause(Duration.ofSeconds(1))
    	.release().build().perform();


    	//driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/div[1]/p")).click();
    	
    	
    	Thread.sleep(80000);
    	       driver.quit();
}
}
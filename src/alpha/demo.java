package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	private static Logger log = LogManager.getLogger(demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		log.debug("Launching URL");
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		log.info("URL Launched Successful");
		log.debug("finding iframes in page");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		log.info("iframes information found");

		try
		{
			log.debug("Switching Frame");
			driver.switchTo().frame(0);
			log.debug("Finding Email");
			String A = driver.findElement(By.xpath("//ul[@class='clearfix']/li/span")).getText();
		System.out.println(A);
		}
		catch(Exception e)
		{
			
			log.error("Email Not found");
			
		}
		
		
	}

}

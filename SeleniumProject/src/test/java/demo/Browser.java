package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();

	driver.get("https://flipkart.com");
	
driver.manage().window().maximize();
	
	driver.findElement(By.name("field-keywords")).sendKeys("iphone");
	Thread.sleep(2000);
	List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
	Thread.sleep(1000);
	for (WebElement sugg : allSugg)
	{
		System.out.println(sugg.getText());
		if(sugg.getText().contains("iphone 15 plus"))
		{
			sugg.click();
			break;
		}
	}
	}


	}
	


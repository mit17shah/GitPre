package Info.Analytica;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pageobject {
	
	
	public WebDriver driver;
	
	public Pageobject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}	
		By Contact=By.xpath("//*[@id='__layout']/div/div/div[1]/div[1]/ul/li[2]/a");
		By Fname=By.xpath("//*[@id='__layout']/div/div/div[2]/div/div/div[3]/div/div/div/form/div/div[1]/div/div/input");
		By Lname=By.xpath("//*[@id='__layout']/div/div/div[2]/div/div/div[3]/div/div/div/form/div/div[2]/div/div/input");
		By Title=By.xpath("//*[@id='__layout']/div/div/div[2]/div/div/div[2]/div[2]/div");
		
		
		
		
		
		public WebElement getContact()
		{
			return driver.findElement(Contact);
		}
		public WebElement getFirstname()
		{
			return driver.findElement(Fname);
		}
		public WebElement getLastname()
		{
			return driver.findElement(Lname);
		}
		public WebElement getTitle()
		{
			return driver.findElement(Title);
		}
		
}

package Info.Analyticaa;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Info.Analytica.Base;
import Info.Analytica.Pageobject;



public class Landingpage extends Base{
	
	
	@BeforeTest
	public void Before() throws IOException
	{
		driver=Basefile();
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test(dataProvider="getData")
	public void Login(String Firstname , String Lastname) throws IOException
	{
		
		Pageobject po=new Pageobject(driver);
		po.getContact().click();
		po.getFirstname().sendKeys(Firstname);
		po.getLastname().sendKeys(Lastname);
		
						
	}

	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="firstusername";
		data[0][1]="firstlastname";
		data[1][0]="secondusername";
		data[1][1]="secondlastname";
		
		return data;
	}
	@AfterTest
	public void After()
	{
		driver.close();
		driver=null;
	}
	
	
}

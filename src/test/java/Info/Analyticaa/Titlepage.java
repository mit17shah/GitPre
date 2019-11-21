package Info.Analyticaa;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Info.Analytica.Base;
import Info.Analytica.Pageobject;

public class Titlepage extends Base{
	
	
	@BeforeTest
	public void before() throws IOException
	{
		driver=Basefile();
		driver.get(prop.getProperty("url"));
	}

	
	@Test
	public void Title() throws IOException
	{
		
		Pageobject po=new Pageobject(driver);
		po.getContact().click();
		Assert.assertEquals(po.getTitle().getText(), "Fill out this form and we’ll get back to you soon");
		
	}

	@AfterTest
	public void after()
	{
		driver.close();
		driver=null;
	}

}

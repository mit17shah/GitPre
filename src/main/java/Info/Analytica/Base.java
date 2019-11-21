package Info.Analytica;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver Basefile() throws IOException
	{
		prop=new Properties();
		FileInputStream File=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Info\\Analytica\\Base.Property");
		prop.load(File);
		String URL=prop.getProperty("browser");
		//String URL=System.getProperty("browser");
		if(URL.contains("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+"\\src\\main\\java\\Info\\Analytica\\chromedriver_win32\\chromedriver.exe" ));
			ChromeOptions Option=new ChromeOptions();
			if(URL.contains("headless"))
			{
				Option.addArguments("headless");
			}
			driver=new ChromeDriver(Option);
		}
		else if(URL.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	
	

}

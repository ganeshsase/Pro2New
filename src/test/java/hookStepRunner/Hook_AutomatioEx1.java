package hookStepRunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook_AutomatioEx1 {
	WebDriver driver;
// this code sets up a mechanism to read browser configuration from a properties file (config.properties)
//and initializes a web browser driver based on the specified configuration using a DriverFactory class. 
//The details of how the browser is initialized are likely implemented in the initBrowser method of the DriverFactory class.
	
	@Before
	public void InitiateBrowser() throws IOException
	{
		Properties prop=new Properties();   //Creates a new instance of the Properties class, which is a class in Java 
											//used for handling configuration properties.
		
		String path = System.getProperty("user.dir")+"//src//test//resources//AutoEx1_Config.properties";
		//Retrieves the current working directory using System.getProperty("user.dir") and appends the relative 
		//path to the configuration properties file (config.properties).
		
		FileInputStream fis=new FileInputStream(path);  //Creates a new FileInputStream to read the contents of the
		                                                //configuration properties file specified by the path variable.
				
		prop.load(fis);  //Loads the properties from the input stream (fis) into the Properties object (prop).
		
		String browserName = prop.getProperty("browser");  //Retrieves the value associated with the key "browser" from the loaded properties
		
		DriverFactory df=new DriverFactory(); // Creates an instance of the DriverFactory class. This class likely contains methods
		                                     //for initializing different web browser drivers.
		driver=df.initBrowser(browserName);  //Calls the initBrowser method of the DriverFactory class, passing the browserName as an argument.
		
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}

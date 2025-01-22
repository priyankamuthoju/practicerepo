package Basepackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 public static WebDriver Driver;
	 
	 
		public static void application_launch()
		{	
			WebDriverManager.chromedriver().setup();	
			Driver= new ChromeDriver();
			Driver.get("https://www.fb.com");	
		}
		
		public static void APplication_close()
		{
<<<<<<< HEAD
			System.out.println("browser closed");
=======
			
>>>>>>> 55f19b0ee67e75e830cf8598e4ee4210e2022e36
			Driver.close();
		}
		
	}

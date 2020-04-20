package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {

		// Selenium Code..
		
		//Create a Driver Object for FireFox.java Browser..
		 
		//We will strictly implements methods of webdriver..
		
//		 	Class name = X; //X is class name..
		 
//		 	X driver=new X();
		
			//invoke .exe file it is the browser driver discussed in selenium web driver architecture
			
			//gecko driver download and set path
		
			System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			
//			Class name = X;  X is class name..
			 
//		 	X driver=new X();
			
			WebDriver driver=new FirefoxDriver();
			
			driver.get("http://google.com");
			
			//To get title..
			System.out.println(driver.getTitle());
			
			
			
			
		 
		

	}

}

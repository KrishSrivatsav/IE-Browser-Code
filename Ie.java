package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ie {

	public static void main(String[] args) {
// Selenium Code..
		
		//Create a Driver Object for IE Browser..
		 
		//We will strictly implements methods of webdriver..
		
//		 	Class name = X; //X is class name..
		 
//		 	X driver=new X();
		
			//invoke .exe file it is the browser driver discussed in selenium web driver architecture
			System.setProperty("webdriver.ie.driver", "D:\\Softwares\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
			
//			Class name = X;  X is class name..
			 
//		 	X driver=new X();
			
			WebDriver driver=new InternetExplorerDriver();
			
			driver.get("https://www.facebook.com/");
			
			//To get title..
			System.out.println(driver.getTitle());
			
			
		 
		

	}

}

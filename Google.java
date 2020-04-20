package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		
//		Class name = X;  X is class name..
		 
//	 	X driver=new X();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");

//		driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("myown xpath");	
		driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[2]/a")).click();
		
	}

}

//lab exam
package testingpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	ChromeDriver driver;
	
	
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\software testing\\workspace\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");  //open
		driver.manage().window().maximize(); //maximise
		//driver.close();//close
		
		
		//driver.close();//close only particular window
		//driver.quit();//close all tabs close browser
	}
	public void login()
	{
		WebElement usnm=driver.findElement(By.name("uid"));
		usnm.sendKeys("mngr475362");
		
		driver.findElement(By.name("password")).sendKeys("bUmYvys");
			 //function chaining
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("New Customer")).click();
		
	}
	

	public static void main(String[] args) {
		Automation o =new Automation();
		o.open();
		o.login();
		// TODO Auto-generated method stub

	}

}

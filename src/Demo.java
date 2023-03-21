import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("shri@gmail.com");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Success");
		}
		else {
			System.out.println("Failure");
		}
	}

}

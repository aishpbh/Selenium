import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.chrome.ChromeOptions;

public class FirstSeleniumTest {
	WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\aishw\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//ChromeOptions opt = new ChromeOptions();
		driver = new EdgeDriver();
		driver.get("http://www.amazon.com");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstSeleniumTest obj = new FirstSeleniumTest();
		obj.launchBrowser();

	}

}

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\chrome driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("http://127.0.0.1:5500/index.html");
		String my_tittle = driver.getTitle();
		System.out.println(my_tittle);
		List <WebElement> options=driver.findElements(By.tagName("option"));
		for(int i=0;i<options.size();i++)
		{System.out.println(options.get(i).getText());}
		

	}

}

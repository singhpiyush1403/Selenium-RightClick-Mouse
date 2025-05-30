import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMouse {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		Actions act = new Actions(driver);
		act.contextClick(button).perform();
		
		System.out.println(driver.getTitle());
		driver.close();
	}
	
}

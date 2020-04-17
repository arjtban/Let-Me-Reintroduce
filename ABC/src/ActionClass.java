import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("WebDriver.Chrome.Driver", "/home/arijit/Documents/eclipse-workspace/ABC/bin/chromedriver");
		System.setProperty("webdriver.chrome.driver","/home/arijit/Documents/eclipse-workspace/ABC/bin/chromedriver");
		
		WebDriver dv=new  ChromeDriver();
		dv.get("https://www.amazon.in/");
		Actions a=new Actions(dv);
		
		//moves cursor to a specific element
		a.moveToElement(dv.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		
		//move cursor to another element and right click there
		
		a.moveToElement(dv.findElement(By.xpath("//*[@id=\"nav-link-prime\"]/span[2]"))).contextClick().build().perform();
		
		
		//composite action -enter text in capital letters
		
		a.moveToElement(dv.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		//select the word written on the search box
		
		a.moveToElement(dv.findElement(By.id("twotabsearchtextbox"))).click().doubleClick().build().perform();
		
		

	}

}

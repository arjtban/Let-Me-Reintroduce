import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/arijit/Documents/eclipse-workspace/ABC/bin/chromedriver");
		WebDriver dv= new ChromeDriver();
		dv.get("https://www.spicejet.com/");
		
		
		/* Locator =id 
		 * 
		 * <li id="header-vacations" class="hide-mobile">
		 * <a href="RedHotOffers.aspx">DEALS</a>
		 *  </li>
		 */
		
		dv.findElement(By.id("header-vacations")).click();
		dv.navigate().back();
		

		/*Locator =name
		 * 
		 * <input id="ctl00_mainContent_ddl_originStation1_CTXT" name="ctl00_mainContent_ddl_originStation1_CTXT"
		 *  selectedtext="" selectedvalue="" value="Departure City" class="select_CTXT"
		 *   menuselection="false" autocomplete="off" style="width: 250px; height: 43px; 
		 *   border: 1px solid rgb(153, 153, 153);">
		 * 
		 */
		dv.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		
		List<WebElement> lst = dv.findElements(By.xpath("//*[@id=\"citydropdown\"]/tbody/tr[2]/td[2]"));
		System.out.println(lst);
		
		
		

	}

}

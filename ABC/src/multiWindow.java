import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/arijit/Documents/eclipse-workspace/ABC/bin/chromedriver");
		WebDriver dv= new ChromeDriver();
		dv.get("https://accounts.google.com/signup");
		dv.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a")).click();
		System.out.println(dv.getTitle());
		
		
		//selenium reads each window with its handle id  using getWindowHandles() method.
		Set<String>ids=dv.getWindowHandles();
		//getWindowHandles() this command gets all the handle ids and throws into the set variable 'ids'
		
		Iterator<String> x=ids.iterator();
		//ids.iterator will iterate over the set structure and pass the window handle to the x -this iterator variable.
		
		//now actual iteration will happen and x will point to the first row of the iteration set
		
		String parentid=x.next();
		String childid=x.next();
		
		dv.switchTo().window(childid);
		System.out.println(dv.getTitle());
		
		

	}

}

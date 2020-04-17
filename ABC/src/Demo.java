import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/arijit/Documents/eclipse-workspace/ABC/bin/chromedriver");
		//System.setProperty("WebDriver.Driver.Chrome", "/home/arijit/Documents/eclipse-workspace/chromedriver");
		WebDriver dv=new ChromeDriver();
		dv.get("http://fr.rancelab.com/378/");
		System.out.println(dv.getTitle());
		System.out.println(dv.getCurrentUrl());
		System.out.println(dv.getPageSource());
		dv.get("https://www.google.com/");
		dv.navigate().back();

		dv.close();
	}

}

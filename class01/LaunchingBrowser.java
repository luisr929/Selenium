package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    //navigate to google.com
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();        //declare instance
        driver.get("https://www.google.com");   //use .get(url) to navigate to the desired url
        driver.manage().window().maximize();    //maximize the window
        String currentURl=driver.getCurrentUrl();   //get current url
        System.out.println("current url is "+currentURl);    //print url
        String title=driver.getTitle();  //get the title of the page
        System.out.println("the title of the page "+title);
        Thread.sleep(5000); //adding wait time
        driver.quit();  //close the browser

    }
}

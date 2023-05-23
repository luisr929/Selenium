package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorTagname {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
       List <WebElement> tags=driver.findElements(By.tagName("a"));

       for (WebElement link:tags){
           String linkOfWebsite= link.getAttribute("href");
           System.out.println(linkOfWebsite);
       }


    }
}

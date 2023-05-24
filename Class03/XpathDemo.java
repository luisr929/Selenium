package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("admin");
        WebElement password= driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
       WebElement loginButton= driver.findElement(By.xpath("//input[contains(@id,'Login')]"));
       loginButton.click();
      WebElement pimTab= driver.findElement(By.xpath("(//a[@id='menu_pim_viewPimModule'])"));
      pimTab.click();

      Thread.sleep(2000);
       // driver.close();
    }
}

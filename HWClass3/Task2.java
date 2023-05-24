package HWClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("admin");
        driver.findElement(By.cssSelector("input#txtPassword"));
       WebElement loginButton= driver.findElement(By.cssSelector("input#btnLogin"));
       loginButton.click();
       driver.findElement(By.cssSelector("span#spanMessage"));
       Thread.sleep(2000);
       driver.quit();
    }
}

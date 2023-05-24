package HWClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[name = 'first_name']")).sendKeys("luis");
        driver.findElement(By.cssSelector("input[name = 'last_name']")).sendKeys("rodriguez");
        driver.findElement(By.cssSelector("input[name = 'email']")).sendKeys("luis@gmail.com");
        driver.findElement(By.cssSelector("input[name = 'phone']")).sendKeys("979465656465");
        driver.findElement(By.cssSelector("input[name = 'address']")).sendKeys("2133 hackensack ave");
        driver.findElement(By.cssSelector("input[name = 'city']")).sendKeys("hackensack");
       // driver.findElement(By.xpath("  //option[text()=\"New Jersey\"]"));
        driver.findElement(By.xpath(" //input[@name='zip']")).sendKeys("07023");
        driver.findElement(By.xpath(" //input[@name='website']")).sendKeys("www.kjdfklsls.com");
        driver.findElement(By.cssSelector(" textarea.form-control")).sendKeys("Selenium");
        Thread.sleep(2000);
       driver.quit();
    }
}

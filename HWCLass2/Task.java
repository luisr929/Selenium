package HWCLass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement newAccount= driver.findElement(By.linkText("Create new account"));
        newAccount.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("luis");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("rod");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("lurod@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("lurod@gmail.com");
        WebElement bMonth= driver.findElement(By.name("birthday_month"));
        bMonth.click();


    }
}

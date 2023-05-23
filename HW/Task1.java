package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("luis");
        driver.findElement(By.id("customer.lastName")).sendKeys("rodriguez");
        driver.findElement(By.id("customer.address.street")).sendKeys("87 washington street ");
        driver.findElement(By.id("customer.address.city")).sendKeys("paramus");
        driver.findElement(By.id("customer.address.state")).sendKeys("NJ");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("14461");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("577537837");
        driver.findElement(By.id("customer.ssn")).sendKeys("235227238");
        driver.findElement(By.id("customer.username")).sendKeys("lu");
        driver.findElement(By.id("customer.password")).sendKeys("dfdf164");
        driver.findElement(By.id("repeatedPassword")).sendKeys("dfdf164");
        Thread.sleep(2000);
        driver.quit();

    }
}

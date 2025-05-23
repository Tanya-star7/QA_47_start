import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhoneBookSelectors {
    WebDriver driver= new ChromeDriver();

    @Test
    public void phoneBookTest(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //homeWork
        FirstTest.pause(5);
        WebElement butonLogin=driver.findElement(By.cssSelector("a[href='/login']");
        butonLogin.click();
        FirstTest.pause(5);
        WebElement inputEmail=driver.findElement(By.cssSelector("input[placeholder='Email']");
        inputEmail.sendKeys("tatyana.star0107@gmail.com");
        FirstTest.pause(2);
        WebElement inputPussWorld=driver.findElement(By.cssSelector("input[name='password']");
        inputPussWorld.sendKeys("Rr123456!");
        FirstTest.pause(3);
        WebElement butonLoginIn=driver.findElement(By.cssSelector("button[name='login']");
        butonLoginIn.click();
        FirstTest.pause();





    }
}

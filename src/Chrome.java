import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //setup the chrome browser
        WebDriver driver = new ChromeDriver();
        //open url
        driver.get(baseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();
        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //print the title of page
        String title = driver.getTitle();
        System.out.println(title);
        //print the current url
        System.out.println("Current url :" + driver.getCurrentUrl());
        //print the page source
        System.out.println("Page Source :" + driver.getPageSource());
        //enter email to email field
        WebElement username = driver.findElement(By.name("user[email]"));
        username.sendKeys("htpatel1993@gmail.com");
        //enter the password to password field
        driver.findElement(By.name("user[password]")).sendKeys("Himanshu1234");
        //close the browser
        driver.close();
        driver.quit();

    }
}

package appealTech.cucumberFramework;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.quit();
    }
}

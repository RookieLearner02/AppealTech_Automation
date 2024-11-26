package utils;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class GenericUtils {
    private final WebDriver driver;

    public GenericUtils(WebDriver driver){
        this.driver=driver;
    }

    public void switchWindowToChild(){
        Set<String> setOne = driver.getWindowHandles();
        Iterator<String> iteratorOne = setOne.iterator();
        String parentWindow = iteratorOne.next();
        String childWindow = iteratorOne.next();
        driver.switchTo().window(childWindow);
    }
}

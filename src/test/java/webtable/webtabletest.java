package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class webtabletest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/deepika/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
    }

    @Test(priority = 1)
    public void printAllTableValues() {
        WebElement table = driver.findElement(By.xpath("//*[@id='customers']"));

        // Iterate through each row and print cell values
        for (WebElement row : table.findElements(By.tagName("tr"))) {
            for (WebElement cell : row.findElements(By.tagName("td"))) {
                System.out.print(cell.getText() + "\t");
                System.out.print(" ");
            }
            System.out.println(); // Move to the next row
        }
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

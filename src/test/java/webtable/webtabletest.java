package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtabletest {
    public static void main(String[] args) {
    	
        System.setProperty("webdriver.chrome.driver", "C:/Users/deepika/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

       
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://www.w3schools.com/html/html_tables.asp");

        
        WebElement table = driver.findElement(By.xpath("//*[@id='customers']"));
        
        System.out.println("Web Table Traced");

        // Retrieve Table Data
        // Iterate through each row and print cell values
        for (WebElement row : table.findElements(By.tagName("tr"))) {
            for (WebElement cell : row.findElements(By.tagName("td"))) {
                System.out.print(cell.getText() + "\t");
                System.out.print(" ");
            }
            System.out.println(); // Move to the next row
        }

        driver.quit();
    }
}

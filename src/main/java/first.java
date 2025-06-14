
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {
    public static void main(String[] args) {


        System.setProperty("C:/Users/erik.vila/IdeaProjects/Selenium_Wakeb_training/drivers/chromedriver.exe","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        try{
            driver.get("https://www.wikipedia.org");
            Thread.sleep(2000);


        }catch(InterruptedException e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }
    }
}

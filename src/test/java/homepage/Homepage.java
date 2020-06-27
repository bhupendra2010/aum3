package homepage;

import common.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class Homepage extends DriverFactory {

    public void baseurl(){
        driver.getCurrentUrl();
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

    }
    public void search() throws InterruptedException {
        driver.findElement(By.id("search")).sendKeys("samsung mobile");
        driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
        List<WebElement> products=driver.findElements(By.cssSelector("button[class='TT--CTA-in-PLP']"));
        products.size();

        Random random=new Random();
        WebElement randomno=products.get(random.nextInt(products.size())-1);
            randomno.click();

        //driver.switchTo().frame("smc_lse_iframe");

        //Actions actions=new Actions(driver);
        //actions.moveToElement(driver.findElement(By.id("gis-connect-to-store-tab"))).build().perform();
        //driver.findElement(By.xpath("//*[@id=\"gis-cta-awareness-close\"]/svg/circle")).click();
        //driver.findElement(By.xpath("//*[@id=\"gis-cta-awareness-close\"]/svg/polygon")).click();
        driver.findElement(By.xpath("//*[@id=\"product-actions\"]/div[4]/div[1]/button")) .click();
        Thread.sleep(5000);
        //driver.switchTo().frame("smc_lse_iframe");
        //Actions actions=new Actions(driver);
        //actions.moveToElement(driver.findElement(By.id("img[id='tcChat_btnCloseChat_skin']"))).build().perform();
        //driver.findElement(By.cssSelector("button[title='Close chat window']")).click();
        driver.findElement(By.cssSelector("button[data-interaction='Continue to basket']")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[3]/div/div/div/div[1]/div[2]/div/div/div[1]/button")).click();
            }
        }




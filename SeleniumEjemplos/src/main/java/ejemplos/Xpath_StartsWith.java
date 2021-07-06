
package ejemplos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_StartsWith {
    
    WebDriver driver;
    
    public void iniciarNavegador() {
        //En esta linea declaramos la ruta donde esta el driver del navegador a usar
        System.setProperty("webdriver.chrome.driver", "/usr/local/sbin/chromedriver");
        driver = new ChromeDriver();
        //Iniciar navegador en esa url
        driver.get("https://developer.salesforce.com/signup");
    }
    
    public void localizar(){
     WebElement el = driver.findElement(By.xpath("//input[starts-with(@id,'last')]"));
        el.sendKeys("Garcia");
    }
    
    public static void main(String[] args) {
        Xpath_StartsWith xsw = new Xpath_StartsWith();
        xsw.iniciarNavegador();
        xsw.localizar();
    }
}

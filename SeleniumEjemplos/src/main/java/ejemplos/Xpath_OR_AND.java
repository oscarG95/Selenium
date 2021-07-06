/*
Evalua 2 condiciones en un elemento donde las 2 pueden ser verdaderas o solo una para localizar el elemento
 */
package ejemplos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpath_OR_AND {
    
    WebDriver driver;
    
    public void iniciarNavegador() {
        //En esta linea declaramos la ruta donde esta el driver del navegador a usar
        System.setProperty("webdriver.chrome.driver", "/usr/local/sbin/chromedriver");
        driver = new ChromeDriver();
        //Iniciar navegador en esa url
        driver.get("https://developer.salesforce.com/signup");
    }
    
    public void localizar(){
        //@id='first_name es la condicion verdadera'
        String xpath = "//input[@name='first' or @id='first_name']";
     WebElement el = driver.findElement(By.xpath(xpath));
        el.sendKeys("Oscar");
     WebElement el2 = driver.findElement(By.xpath("//input[@type='email' and @id='email']"));
     el2.sendKeys("correo@gmail.com");
    }
    
    public static void main(String[] args) {
              
        Xpath_OR_AND xpo = new Xpath_OR_AND();
        xpo.iniciarNavegador();
        xpo.localizar();
    }
    
}

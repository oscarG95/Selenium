/* Metodo text es usado para encontrar el elemento con la 
coicidencia exacta de texto
*/
package ejemplos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author oscar
 */
public class Xpath_Text {
    
    WebDriver driver;
    
    public void iniciarNavegador() {
        //En esta linea declaramos la ruta donde esta el driver del navegador a usar
        System.setProperty("webdriver.chrome.driver", "/usr/local/sbin/chromedriver");
        driver = new ChromeDriver();
        //Iniciar navegador en esa url
        driver.get("https://developer.salesforce.com/signup");
    }
    
    public void localizar(){
        String xpath = "//a[text()=' Terms of Use']";
     WebElement el = driver.findElement(By.xpath(xpath));
        el.click();
     
    }
    
    public static void main(String[] args) {
        
        Xpath_Text xt = new Xpath_Text();
        xt.iniciarNavegador();
        xt.localizar();
    }
    
}

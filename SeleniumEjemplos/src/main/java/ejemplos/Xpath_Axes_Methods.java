/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Xpath_Axes_Methods {
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
        String xpath = "//select[@name='user[country]']//child::option[@value='SV']";
     WebElement el = driver.findElement(By.xpath(xpath));
     
 }
    public static void main(String[] args) {
       Xpath_Axes_Methods xam = new Xpath_Axes_Methods();
       xam.iniciarNavegador();
       xam.localizar();
    }
}

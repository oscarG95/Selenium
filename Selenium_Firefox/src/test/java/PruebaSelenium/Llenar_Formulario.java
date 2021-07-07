package PruebaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import javax.swing.JOptionPane;

import org.openqa.*;

public class Llenar_Formulario {
	
	WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		Llenar_Formulario se= new Llenar_Formulario();
		se.inicializar(); 
se.llenarForm();
	}

	public  void inicializar() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("http://computer-database.gatling.io/computers/381");	
	}
	
	public void llenarForm() throws InterruptedException {
		WebElement name = driver.findElement(By.id("name"));
		name.clear();
		name.sendKeys("lenovo");
		
		WebElement introduced = driver.findElement(By.id("introduced"));
		introduced.sendKeys("2000-01-01");
		
		WebElement discontinued = driver.findElement(By.id("discontinued"));
		discontinued.sendKeys("2020-01-01");
		
		Select company = new Select(driver.findElement(By.id("company")));
		company.selectByVisibleText("Lenovo Group");
		
		Thread.sleep(5000);
		WebElement guardar = driver.findElement(By.cssSelector("input[value='Save this computer']"));
		guardar.click();
		
		JOptionPane.showMessageDialog(null,"Se guardo con exito el registro");
		driver.close();
		}
}

package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EbayPage {
WebDriver driver;
	
	By searchToy=By.xpath("//*[@id=\"gh-ac\"]");
	By searchBtn=By.xpath("//*[@id=\"gh-btn\"]");
	By toy1=By.xpath("//*[@id=\"item2b559a9912\"]/div/div[1]/div/a/div/img");
	By cart=By.xpath(" //*[@id=\"mainContent\"]/div[2]/div/div[1]/div[2]/ul/li[2]/div/a");
	By policies=By.xpath("//*[@id=\"gf-l\"]/li[6]/a");
	By regBtn=By.xpath("//*[@id=\"gh-ug-flex\"]/a");
	
	By pAccount=By.xpath("//*[@id=\"personalaccount-radio\"]");
	By fname=By.xpath("//*[@id=\"firstname\"]");
	By lname=By.xpath("//*[@id=\"lastname\"]");
	By email=By.xpath("//*[@id=\"Email\"]");
	By password=By.xpath("//*[@id=\"password\"]");
	
	By Button=By.xpath("//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]");
	
	
	public EbayPage(WebDriver driver) 
	{
		this.driver=driver;
		
	}

	public void search()
	{
		driver.findElement(searchToy).sendKeys("Toys");
		driver.findElement(searchBtn).click();           //Search Toy
				
	}
	public void toyClick()
	{
		driver.findElement(toy1).click();   //click on toy
	}
	public void add_Cart()
	{
		driver.findElement(cart).click(); //add to cart
		driver.findElement(policies).click(); //Link policies at bottom
		
	}
	public void registrationClick()
	{
		driver.findElement(regBtn).click();  // Back to home and Registration Button click
	}
	public void registration()
	{
		driver.findElement(pAccount).click();
		driver.findElement(fname).sendKeys("Anu");
		driver.findElement(lname).sendKeys("Paul");            //Registration
		driver.findElement(email).sendKeys("anu123@gmail.com");
		driver.findElement(password).sendKeys("Anu123");
		
		driver.findElement(Button).click();
	}
	
	

}

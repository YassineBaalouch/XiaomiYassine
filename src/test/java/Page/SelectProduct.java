package Page;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class SelectProduct {
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[2]/div[4]/form/div/select")
	WebElement triproductselect;
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div")
	List<WebElement> Produitlist;
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div/div/div/div[2]/div[1]/div/div[1]/div/div[1]/h1")
	WebElement verif;
	
	public SelectProduct() {
		PageFactory.initElements(Config.driver, this);
	}

	public void triproductsortby(String sorttri) {
		Select select= new Select(triproductselect);
		select.selectByVisibleText(sorttri);
	}
	public void clickonpdtbyname(String ProductName) throws Exception {
		 // Créez une instance de JavascriptExecutor
	    JavascriptExecutor js = (JavascriptExecutor) Config.driver;

	    // Faites défiler la page vers le bas (par exemple, de 800 pixels)
	   js.executeScript("window.scrollBy(0,1200)");
				       
				       Thread.sleep(3000);
		for (WebElement produit: Produitlist) {
			try {
			if(produit.getText().contains(ProductName)) {
				produit.click();			
			}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	public String verifmessage() {
		String Actualtext = verif.getText();
		return Actualtext;
	}
}

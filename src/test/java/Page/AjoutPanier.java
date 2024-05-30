package Page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;


public class AjoutPanier {
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/button")
	WebElement AjoutPanier;
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div/div/div/div/div/a/span/i")
	WebElement Panier;
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/ul/li/div[2]/a[1]/span")
	WebElement VerifPanier;
	
	
	public AjoutPanier() {
		PageFactory.initElements(Config.driver, this);
	}
	public void Ajoutproduitpanier() throws Exception {
		
		AjoutPanier.click();
		Thread.sleep(3000);
		Panier.click();
		
		
	}
	public void VerifPanier(String ProductName) {
		String PdtPanier=VerifPanier.getText();
		Assert.assertEquals(ProductName, PdtPanier);
	}

}

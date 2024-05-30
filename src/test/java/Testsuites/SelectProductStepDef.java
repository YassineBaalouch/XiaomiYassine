package Testsuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Page.SelectProduct;
import Page.SubMenu;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectProductStepDef {
	@Given("Utilisateur dans la page Maison connectée")
	public void utilisateur_dans_la_page_maison_connectée() throws Exception {
		Config.Confchrome();
		   Config.driver = new ChromeDriver();
		   Config.configmaximazewindow();
		   Config.driver.get(Utils.getproprety("Web_Link_2"));
	}
	@When("utilisateur effectue un tri avec le prix croissant And utilisateur choisis {string}")
	public void utilisateur_effectue_un_tri_avec_le_prix_croissant_and_utilisateur_choisis(String productName) throws Exception {
		SelectProduct page= new SelectProduct();
		page.triproductsortby("Tri par tarif croissant");
		Thread.sleep(5000);
		SelectProduct produit= new SelectProduct();
		produit.clickonpdtbyname(productName);
	}


	@Then("utilisateur se derige vers la page du produit {string}")
	public void utilisateur_se_derige_vers_la_page_du_produit(String pageName) {
		SubMenu page=new SubMenu();
	    String ActualText=page.verifmessage();
	    
	}


}

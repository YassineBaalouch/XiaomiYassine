package Testsuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Page.AjoutPanier;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjoutPanierStepDef {
	@Given("Utilisateur dans la page du produit Mi Temperature and Humidity Monitor Pro")
	public void utilisateur_dans_la_page_du_produit_mi_temperature_and_humidity_monitor_pro1() throws Exception {
	   
	Config.Confchrome();
	   Config.driver = new ChromeDriver();
	   Config.configmaximazewindow();
	   Config.driver.get(Utils.getproprety("Web_Link_3"));
	}
	@When("utilisateur ajoute le produit Mi Temperature and Humidity Monitor Pro dans le panier")
	public void utilisateur_ajoute_le_produit_mi_temperature_and_humidity_monitor_pro_dans_le_panier() throws Exception {
		AjoutPanier produit = new AjoutPanier();
		produit.Ajoutproduitpanier();
	}


	
@Then("{string} est disponible dans le panier")
public void est_disponible_dans_le_panier(String ProductName) {
	AjoutPanier pdt=new AjoutPanier();
	pdt.VerifPanier(ProductName);
	
	
    
}

}

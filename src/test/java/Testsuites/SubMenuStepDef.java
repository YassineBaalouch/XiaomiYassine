package Testsuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Page.SubMenu;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubMenuStepDef {
	@Given("Utilisateur en page dacceuil")
	public void utilisateur_en_page_dacceuil() throws Exception {
		Config.Confchrome();
		   Config.driver = new ChromeDriver();
		   Config.configmaximazewindow();
		   Config.driver.get(Utils.getproprety("Web_Link"));
	}
	
	@When("utilisateur survole la souris sur le menu {string}")
	public void utilisateur_survole_la_souris_sur_le_menu(String menuName) throws Exception {
		SubMenu page=new SubMenu();
		page.mousehoveronmenubyname(menuName);
	    
	}

	@When("utilisateur choisis {string}")
	public void utilisateur_choisis(String subMenuName) {
	    SubMenu page=new SubMenu();
	    page.clickonSubMenu(subMenuName);
	}

	@Then("utilisateur se derige vers la page qui contient {string}")
	public void utilisateur_se_derige_vers_la_page_qui_contient(String subMenuName) {
	    SubMenu page=new SubMenu();
	    String ActualText=page.verifmessage();
	}

}

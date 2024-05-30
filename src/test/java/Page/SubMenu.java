package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class SubMenu {
	@FindBy (xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
	List<WebElement> menus;
	@FindBy (xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li[3]/div/div/div/div/section/div/div/div/div")
	List<WebElement> submenus;
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")
	WebElement verif;
	


public SubMenu() {
	PageFactory.initElements(Config.driver, this);
}
public void mousehoveronmenubyname(String menuTitle) throws Exception {
	Thread.sleep(5000);
	
		for(WebElement menu:menus) {
			if(menu.getText().contains(menuTitle)) {
				Config.action = new Actions(Config.driver);
				Config.action.moveToElement(menu).perform();
				Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				}
			}
		}
public void clickonSubMenu(String subMenuTitle) {
	try {
	for(WebElement submenu:submenus) {
		if(submenu.getText().contains(subMenuTitle)) {
			submenu.click();
		}
	}
	}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

public String verifmessage() {
	String Actualtext = verif.getText();
	return Actualtext;
}
}

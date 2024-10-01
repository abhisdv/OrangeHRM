package hrm_Admin;

import org.openqa.selenium.Keys;

import generic.Base_class;
import generic.Property;
import ohrm_pom_ele_repo.Ele_ohrm;

public class MethodRepo_admin extends Base_class {
	public void login() {
		
		Ele_ohrm pom = new Ele_ohrm(driver);
		Property pr = new Property();
		System.out.println(pom.log().getText());
		pom.log().sendKeys(pr.fetch("un"), Keys.TAB, pr.fetch("pwd"), Keys.TAB, Keys.ENTER);
	}

}

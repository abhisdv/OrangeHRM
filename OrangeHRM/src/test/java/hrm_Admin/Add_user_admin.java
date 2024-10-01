package hrm_Admin;

import org.testng.annotations.Test;

import generic.Base_class;

public class Add_user_admin extends Base_class {
	@Test
	public void login() {
		MethodRepo_admin mr = new MethodRepo_admin();
		System.out.println("new implementation");
		mr.login();
	}
}

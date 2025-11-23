package tests;

import base.BaseTest;
import pages.LoginPage;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest{

	@Test
	public void verifyLogin() {
		LoginPage login = new LoginPage(driver);
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickLogin();
	}
	
}

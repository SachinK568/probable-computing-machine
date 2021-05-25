package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genric.Base_Test;
import genric.genric_fetch_excel;
import pom.Flipkart_login;

public class log_in extends Base_Test {
@Test
public  void login_app()
{
	String un = genric_fetch_excel.getdata(0, 0, "sheet1");
	String paswd = genric_fetch_excel.getdata(0, 1,"sheet1");
	Flipkart_login fl= new Flipkart_login(driver);
	fl.setuser(un);
	fl.setpwd(paswd);
	Assert.fail();
	fl.login();
}
}
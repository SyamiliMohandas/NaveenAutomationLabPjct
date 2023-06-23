package Test;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.HomePage;
import utilities.ExcelUtility;

public class HomeTestPage extends BaseClass {

	//Register
	@Test(enabled=false)
	public void registerTest()
	{
		HomePage hp=new HomePage(driver);
		hp.register();
	}
	
	//Login
	@Test(priority=1)
	public void loginTest()
	{
		HomePage hp=new HomePage(driver);
		hp.login1();
		String xl ="D:\\LUMINAR\\selenium\\Book2.xlsx";
		String Sheet ="Sheet1";
		int rowCount =ExcelUtility.getRowCount(xl,Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			
			String UserName = ExcelUtility.getCellValue(xl,Sheet,i,0);
			System.out.println(UserName);
			String pwd = ExcelUtility.getCellValue(xl,Sheet,i,1);
			System.out.println(pwd);
			hp.setValues(UserName,pwd);
			hp.login2();

			
			
		}
	}
	
	@Test(enabled=false)
	public void selectProductTest() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.selectProduct();
	}
	@Test(priority=2)
	public void selectProductTest2() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);

		hp.selectProduct2();
	}
	@Test(enabled=false)
	public void newAddressTest() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.newAddress();
	}
	@Test(priority=3)
	public void excistingAddressTest() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.excistingAddress();
	}
	@Test(priority=4)
	public void paymentTest() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.payment();
	}
}

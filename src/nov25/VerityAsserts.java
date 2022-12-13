package nov25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class VerityAsserts{
WebDriver driver;
String expected="";
String actual ="";
@BeforeMethod
public void setUp()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://yahoo.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Test
public void verifyTitle1()
{
	expected ="Google";
	actual = driver.getTitle();
	try {
	Assert.assertEquals(expected, actual,"Title is Not Matching");
	}catch(Throwable t)
	{
		System.out.println(t.getMessage());
	}
}
@Test
public void verifyTitle2()
{
	expected ="Google";
	actual = driver.getTitle();
	try {
	Assert.assertTrue(expected.equalsIgnoreCase(actual), "Title is Not Matching");
	}catch(Throwable t)
	{
		System.out.println(t.getMessage());
	}
	}
@Test
public void verifyTitle3()
{
	expected ="Google";
	actual = driver.getTitle();
	try {
	Assert.assertFalse(expected.equalsIgnoreCase(actual), "Title is Matching");
	}catch(Throwable t)
	{
		System.out.println(t.getMessage());
	}
	}
@AfterMethod
public void tearDown()
{
	driver.close();
}
}


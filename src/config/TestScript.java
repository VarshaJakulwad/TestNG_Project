package config;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends AppUtil{
@Test
public void Branches()
{
	driver.findElement(By.xpath("(//img)[5]")).click();
	Reporter.log("Executing Branches Test",true);
}
@Test
public void Roles()
{
	driver.findElement(By.xpath("(//img)[6]")).click();
	Reporter.log("Executing Roles Test",true);
}
@Test
public void Users()
{
	driver.findElement(By.xpath("(//img)[7]")).click();	
	Reporter.log("Executing Users Test",true);
	
}
}

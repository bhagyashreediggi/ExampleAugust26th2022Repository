package com.sgtesting.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyCustomer5{
public static WebDriver oBrowser=null;
public static void main(String[] args) {
lunchBrowser();
navigate();
login();
createCustomer();
modifyCustomer();
deleteCustomer1();
logout();
closeBrowser();


}

private static void lunchBrowser()
{
try
{
System.setProperty("webdriver.chrome.driver", "G:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
oBrowser=new ChromeDriver();

}catch(Exception e)
{
e.printStackTrace();
}
}
private static void navigate()
{
try
{
oBrowser.get("http://localhost/login.do");
}catch(Exception e)
{
e.printStackTrace();
}
}
private static void login()
{
try
{
oBrowser.findElement(By.id("username")).sendKeys("admin");
oBrowser.findElement(By.name("pwd")).sendKeys("manager");
oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
Thread.sleep(3000);

}catch(Exception e)
{
e.printStackTrace();
}
}
private static void createCustomer()
{
try
{
	oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
	Thread.sleep(2000);
	oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
	Thread.sleep(2000);
	oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
	Thread.sleep(2000);
	oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Selenium");
	oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
	Thread.sleep(2000);
}catch(Exception e)
{
e.printStackTrace();
}

}
private static void modifyCustomer()                    
{
try
{
oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
Thread.sleep(3000);
oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("Civil Engineer");
Thread.sleep(3000);
oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
Thread.sleep(3000);

}catch(Exception e)
{
e.printStackTrace();
}
}
private static void deleteCustomer1()
{
try
{
oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
Thread.sleep(3000);
oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
Thread.sleep(3000);
oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
Thread.sleep(3000);
oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
Thread.sleep(3000);
}catch(Exception e)
{
e.printStackTrace();
}
}
private static void logout()
{
try
{
oBrowser.findElement(By.id("logoutLink")).click();
Thread.sleep(4000);

}catch(Exception e)
{
e.printStackTrace();
}

}
private static void closeBrowser()
{
try
{
oBrowser.quit();

}catch(Exception e)
{
e.printStackTrace();
}
}


}



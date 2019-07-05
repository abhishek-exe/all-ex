package selen;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TEST {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");

		System.out.println("step 1 : Open Browser");
		WebDriver driver = new ChromeDriver();

		System.out.println("step 2 : enter url");
		driver.get("file:///C:/Users/Shree/Desktop/selenium/Selenium%20Software/Offline%20Website/index.html");

		System.out.println("step 3 : find email textbox");
		WebElement email = driver.findElement(By.xpath(".//*[@id='email']"));

		System.out.println("step 4 : enter email in to textbox");
		email.sendKeys("kiran@gmail.com");

		System.out.println("step 5 : find password textbox");
		WebElement password = driver.findElement(By.xpath(".//*[@id='password']"));

		System.out.println("step 6 : enter password in to textbox");
		password.sendKeys("123456");

		System.out.println("step 7 : click on login button");
		WebElement loginbtn = driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		loginbtn.click();

		System.out.println("step 8 ; click on users");
		WebElement users = driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a"));
		users.click();
		System.out.println("step 9 ; click on add user");
		WebElement adduser = driver
				.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
		adduser.click();
		System.out.println("step 10: enter usernameint to the textbox");
		WebElement username = driver.findElement(By.xpath(".//*[@id='username']"));
		username.sendKeys("abhishek");
		
		System.out.println("step 11:enter mobile no. in textbox");
		WebElement mobile= driver.findElement(By.xpath(".//*[@id='mobile']"));
		mobile.sendKeys("0123456789");
		
		System.out.println("step 12 : enter email in textbox");
		WebElement email1 = driver.findElement(By.xpath(".//*[@id='email']"));
		email1.sendKeys("abhishek@gmail.com");
		
		System.out.println("step 13 : select gender");
		WebElement gender = driver.findElement(By.xpath(".//*[@id='Male']"));
		gender.click();

		System.out.println("step 14: select state fron dropdown menu");
	
		WebElement state = driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select"));
		Select state1 = new Select(state);
		state1.selectByVisibleText("Maharashtra");
		
		/*System.out.println("step 15 : enter password in password space");
		WebElement dd=driver.findElement();
		Select s=new Select(dd);
		s.selectByValue(value);*/
		
		System.out.println("step 15 : enter password in password space");
		WebElement password1 = driver.findElement(By.xpath(".//*[@id='password']"));
		password1.sendKeys("123456");
		
		System.out.println("submit the form");
		WebElement submit = driver.findElement(By.xpath(".//*[@id='submit']"));
		
				submit.click();
		
	}
}

package com.jbk;

public class Grid {

	@Parameters("browser")  @BeforeTest  public void launchapp(String browser) throws MalformedURLException {   String URL = "http://www.javabykiran.com/selenium/demo"; 
	 
	  if (browser.equalsIgnoreCase("firefox")) {    System.out.println(" Executing on FireFox");    String Node = "http://localhost:5555/wd/hub";    DesiredCapabilities cap = DesiredCapabilities.firefox();    cap.setBrowserName("firefox"); 
	 
	   driver = new RemoteWebDriver(new URL(Node), cap);    // Puts an Implicit wait, Will wait for 10 seconds before throwing    // exception    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 
	   // Launch web site    driver.navigate().to(URL);    driver.manage().window().maximize();   } else if (browser.equalsIgnoreCase("chrome")) {    try {     System.out.println(" Executing on CHROME");     DesiredCapabilities cap = DesiredCapabilities.chrome();     cap.setBrowserName("chrome");     String Node = "http://localhost:5557/wd/hub";     driver = new RemoteWebDriver(new URL(Node), cap);     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 
	    // Launch website     driver.navigate().to(URL);     driver.manage().window().maximize();    } catch (Exception e) {     e.printStackTrace();    }   } else {    throw new IllegalArgumentException("The Browser Type is Undefined");   }  } 
	 
	 @Test  public void testUnameBlankMessage() { 
	 
	  // Maximize window   driver.manage().window().maximize(); 
	 
	  // locate email element   WebElement userEle = driver.findElement(By.id("email"));   // enter uname into text box   userEle.sendKeys(" "); 
	 
	  // locate password element   WebElement passwordEle = driver.findElement(By.id("password"));   // enter password into text box   passwordEle.sendKeys(" "); 
	 
	  // locate signin button   WebElement signInbuttonEle = driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));   // click signin button   signInbuttonEle.click(); 
}
	 String unameErrorMessage = driver.findElement(By.id("email_error")).getText(); 
	 
	  Assert.assertEquals("Please enter email.", unameErrorMessage); 
	 
	 } 
	 
	 @AfterTest  public void closeBrowser() {   driver.quit();  } } 
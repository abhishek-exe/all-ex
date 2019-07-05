import org.apache.log4j.Logger;//driver;

public class GmailLogin {
	//static Web//driver //driver;
	private static Logger log = Logger.getLogger("GmailLogin");
	public static void main(String[] args) throws InterruptedException {
		// BasicConfigurator.configure();
		System.out.println("asfsfsdfs");
		System.out.println("PQR");
		// PropertyConfigurator.configure("log4j.properties");
		//driver = new Firefox//driver();
		log.info("opening the firefox browser");
		//driver.get("file:///C:/java/16%2010/Offline%20Website%20_%20new/index.html");
		log.info("navigation to offline website");
		
		//driver.findElement(By.id("email")).clear();
		log.info("clearing the email textbox");
		//driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		log.info("username typed");
		//log.warn("not typed correctly");
		//driver.findElement(By.id("password")).clear();
		log.info("clearing the password textbox");
		//driver.findElement(By.id("password")).sendKeys("123456");
		log.info("password typed");
		//driver.findElement(
			//	By.xpath("html/body/div[1]/div[2]/form/div[3]/div/button"))
			//	.click();
		log.info("clicking on submit button");
		Thread.sleep(5000);
		//driver.quit();
		log.info("browser closed");

	}

}

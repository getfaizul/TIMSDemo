import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Treaty_Submit {



public static void main(String[] args) throws InterruptedException {

//Invoking Browser

//Chrome - ChromeDriver exten->Methods close get

//Firefox- FirefoxDriver ->methods close get

// WebDriver  close  get

//WebDriver methods + class methods

// Chrome

         ChromeOptions options = new ChromeOptions();

         options.addArguments("--remote-allow-origins=*");

System.setProperty("webdriver.chrome.driver", "C:\\Users\\FaizulKabir\\Downloads\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver(options);



////Firefox
//
//System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");
//
//WebDriver driver1 = new FirefoxDriver();
//
////Microsoft Edge
//
//System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");
//
//WebDriver driver2 = new EdgeDriver();

//driver.get("https://apps.gov.powerapps.us/play/e/e51af5c1-d368-e8cd-8264-410297a458ca/a/719490fc-8d8d-4a97-bf2e-02256d85a455?tenantId=c04ce5ba-3bf0-4e56-aa5c-bed3addf874a&source=portal");
//driver.switchTo().window(driver.getWindowHandle());
//driver.findElement(By.name("loginfmt")).sendKeys("kabirf");
driver.get("https://login.microsoftonline.com/");
Thread.sleep(5000);
WebElement usernameField = driver.findElement(By.id("i0116"));
usernameField.sendKeys("kabirf@usdossiolab.onmicrosoft.com");

WebElement nextButton = driver.findElement(By.id("idSIButton9"));
nextButton.click();
Thread.sleep(5000);

WebElement passwordField = driver.findElement(By.id("i0118"));
passwordField.sendKeys("Cs172nixon@ac0017");

WebElement nextButton2 = driver.findElement(By.cssSelector("[value=\"Sign in\"]"));
nextButton2.click();

Thread.sleep(5000);

driver.findElement(By.cssSelector("#idDiv_SAOTCS_Proofs > div:nth-child(2) > div > div > div.table-cell.text-left.content > div")).click();

Thread.sleep(15000);

driver.findElement(By.cssSelector("[id=\"idSIButton9\"]")).click();
Thread.sleep(5000);

driver.get("https://apps.gov.powerapps.us/play/e/e51af5c1-d368-e8cd-8264-410297a458ca/a/719490fc-8d8d-4a97-bf2e-02256d85a455?tenantId=c04ce5ba-3bf0-4e56-aa5c-bed3addf874a&source=portal");

Thread.sleep(20000);
System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());

// Click on Sandwich icon
driver.findElement(By.cssSelector("[data-shortcut-id=\"1\"]")).click();


// Click on "Add New Entry" option
driver.findElement(By.xpath("//*[text()='Add New Entry']")).click();


// Verify the "Add New Entry" page opens


// Enter Title

driver.findElement(By.cssSelector("[aria-label=\"Title\"]")).sendKeys("Test Title");

// Enter Conclude and EIF

driver.findElement(By.cssSelector("[aria-label=\"Conclude and EIF\"]")).sendKeys("Signed on March 3rd");


// Select Instrument Type

Select InstrumentType = new Select(driver.findElement(By.id("Enter_Selector")));
InstrumentType.selectByVisibleText("Enter_Text");

// Select Classification
Select Classification = new Select(driver.findElement(By.id("Enter_Selector")));
Classification.selectByVisibleText("Enter_Text");

// Select Existence Classification

Select ExisClassification = new Select(driver.findElement(By.id("Enter_Selector")));
ExisClassification.selectByVisibleText("Enter_Text");

// Select Category

Select Category = new Select(driver.findElement(By.id("Enter_Selector")));
Category.selectByVisibleText("Enter_Text");

// Select Sub-Category

Select SubCategory = new Select(driver.findElement(By.id("Enter_Selector")));
SubCategory.selectByVisibleText("Enter_Text");

// Party pop - up entry
// Click on Party Pop up

// Click on Add New button

// Select Country/Organization

Select CountryParty = new Select(driver.findElement(By.id("Enter_Selector")));
CountryParty.selectByVisibleText("Enter_Text");

// Select Individual Party

Select IndividualParty = new Select(driver.findElement(By.id("Enter_Selector")));
IndividualParty.selectByVisibleText("Enter_Text");

// Select Method Entry into Force

Select MthdEntryIntoForce = new Select(driver.findElement(By.id("Enter_Selector")));
MthdEntryIntoForce.selectByVisibleText("Enter_Text");

// Click on Add/ Modify

// Click on Save button (Party)


// Does this go in TIF Yes/No


// Click on Save button (Treaty Records)

// Capture the Treaty number

// Search for the Treaty



//driver.findElement(By.cssSelector("[]")).click();

driver.close();

//driver.quit();



}



}


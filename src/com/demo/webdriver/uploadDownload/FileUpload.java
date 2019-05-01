package com.demo.webdriver.uploadDownload;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import com.demo.datadriven.ExtractToList;

public class FileUpload {

	private static WebElement pimMenu;
	private static WebElement AddEmployee;
	static WebDriver driver;
	String Password;
	String randomString = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	int empIDs;
	String filetobeUploaded="C:\\Tosca\\download.jfif";
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		System.setProperty("webdriver.chrome.driver","\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(capabilities);
		String baseUrl = "http://www.newtours.demoaut.com/";
		driver.get(baseUrl);
		
		FileUpload fileUploadObj= new FileUpload(driver);
		fileUploadObj.login(driver);
		fileUploadObj.mouserhoverAndActionClick(driver);
		fileUploadObj.pageElements(driver);
		fileUploadObj.fillempDetails();

	}
	private void fillempDetails() {
		// TODO Auto-generated method stub
		
	}
	public int randomIntGen(){
		Random rand = new Random(); 
		int value = rand.nextInt(5000); 
		return value;
	}
	
	public String randomStringGen(){
		String sb=Long.toHexString(Double.doubleToLongBits(Math.random()));
	   return sb;
	}
	
	public FileUpload(WebDriver driver){
		String userName= driver.findElement(By.name("username"));//By id 
		String password= driver.findElement(By.name("password"));//By name 
		String submit= driver.findElement(By.name("login"));//By name 	
	}
	public void pageElements(WebDriver driver){
		
		
		String empFirstName= driver.findElement(By.name("firstName"));
		String empMiddleName= driver.findElement(By.name("middleName"));
		String empLastName= driver.findElement(By.name("lastName"));
		String empID= driver.findElement(By.name("employeeId"));
		String uploadFile= driver.findElement(By.name("photofile"));
		String empLoginDetailsChkBox= driver.findElement(By.name("chkLogin"));
		String empSubmit= driver.findElement(By.id("btnSave"));
		String empUserName= driver.findElement(By.name("user_name"));
		String empUserPass= driver.findElement(By.name("user_password"));
		String empUserPassConfirm= driver.findElement(By.name("re_password"));
		String empStatus= driver.findElement(By.name("status"));
		
	}
	public void fillempDetails(){
		WebElement empFirstName;
		empFirstName.sendKeys(randomStringGen());
		WebElement empMiddleName;
		empMiddleName.sendKeys(randomStringGen());
		WebElement empLastName;
		empLastName.sendKeys(randomStringGen());
		empIDs=randomIntGen();
		String IDs=String.valueOf(empIDs);
		WebElement empID;
		empID.sendKeys(IDs);
		WebElement uploadFile;
		uploadFile.sendKeys(filetobeUploaded);
		WebElement empLoginDetailsChkBox;
		empLoginDetailsChkBox.click();
		WebElement empUserName;
		empUserName.sendKeys(randomStringGen());
		Password=randomStringGen();
		WebElement empUserPass;
		empUserPass.sendKeys(Password);
		WebElement empUserPassConfirm;
		empUserPassConfirm.sendKeys(Password);
		dropDownItemSelect(empStatus,"Enabled");
		WebElement empSubmit;
		empSubmit.click();
		
	}
	
	public void dropDownItemSelect(WebElement element,String value){
		
		Select dropDown= new Select(element);
		dropDown.selectByVisibleText(value);
		
	}
	public void mouserhoverAndActionClick(WebDriver driver) throws InterruptedException{
		pimMenu=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b"));
		pimMenu.click();
		Actions builder = new Actions(driver);
		//builder.moveToElement( pimMenu ).perform();
		AddEmployee=driver.findElement(By.linkText("Add Employee"));
		builder.moveToElement( AddEmployee ).perform();;
		builder.click(AddEmployee).perform();
		//builder.build().perform();
		System.out.println("Mouseover and click successful on menu "+AddEmployee.toString());
	
}
	
	
	public void login(WebDriver driver){
		
		ExtractToList dataList= new ExtractToList();
		ArrayList<ArrayList<Object>> testData= new ArrayList<ArrayList<Object>>();
		testData=dataList.extractAsLists();
		for (int k=0;k<=testData.size()-1;k++){
		WebElement userName = driver.findElement(By.name("userName"));//By id 
		WebElement password = driver.findElement(By.name("password"));//By name 
		WebElement submit = driver.findElement(By.name("login"));//By name 	
		userName.sendKeys(testData.get(k).get(1).toString());
		password.sendKeys(testData.get(k).get(2).toString());
		submit.click();
		}
	}
}

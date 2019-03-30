package com.demo.webdriver.random;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class DatePickerAndSelect {
	private WebElement userName;
	private WebElement password;
	private WebElement submit;
	private static WebElement fromDate;
	private WebElement toDate;
	private WebElement leaveStatus;
	private WebElement empName;
	private WebElement subUnit;
	private WebElement search;
	private static WebElement leave;
	private static WebElement leaveList;
	static String id= "calFromDate";
	static String toDate1="01\01\2017";
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
		String baseUrl = "http://goibibo.com/";
		driver.get(baseUrl);
		DatePickerAndSelect datePickerAndSelectObj= new DatePickerAndSelect(driver);
		/*datePickerAndSelectObj.login();
		datePickerAndSelectObj.mouserhoverAndActionClick(driver);
		datePickerAndSelectObj.pageElement(driver);*/
		datePickerAndSelectObj.datePicker(driver,id,toDate1);
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
	public DatePickerAndSelect(WebDriver driver){
		/*	userName= driver.findElement(By.id("txtUsername"));//By id 
		password= driver.findElement(By.name("txtPassword"));//By name 
		submit= driver.findElement(By.className("button"));//By name 
		 */
	}

	public void pageElement(WebDriver driver){
		fromDate= driver.findElement(By.xpath("//input[@value=''])[3]")); 
		/*toDate= driver.findElement(By.name("calToDate"));
		leaveStatus= driver.findElement(By.id("leaveList_chkSearchFilter_1")); 	
		empName = driver.findElement(By.name("leaveList[txtEmployee][empName]"));
		subUnit = driver.findElement(By.id("leaveList_cmbSubunit"));
		search = driver.findElement(By.id("btnSearch"));*/



	}

	public void login(){
		userName.sendKeys("Admin");
		password.sendKeys("admin");
		submit.click();
	}

	public void mouserhoverAndActionClick(WebDriver driver) throws InterruptedException{
		leave=driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']/b"));
		Actions builder = new Actions(driver);
		builder.moveToElement( leave ).perform();
		leaveList=driver.findElement(By.linkText("Leave List"));
		builder.moveToElement( leaveList ).perform();;
		builder.click(leaveList).perform();
		//builder.build().perform();
		System.out.println("Mouseover and click successful on menu "+leaveList.toString());

	}

	public void dropDownItemSelect(WebElement element,String value){

		Select dropDown= new Select(element);
		dropDown.selectByVisibleText(value);

	}

	public void datePicker(WebDriver driver,String id, String toDate) throws InterruptedException{
		/*JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeAsyncScript("document.getElementbyId().value='05/05/2014'");*/
		fromDate= driver.findElement(By.xpath("//div[3]/div/div/div/input")); 
		/*fromDate.click();
		fromDate.sendKeys("05/05/2014");*/
		fromDate.click();
		
		Date date = new Date();

		Calendar cal = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy");
		cal.setTime(date);
		String date1="Aug 16 2017";
		WebElement SelDate= driver.findElement(By.xpath("//input[@value='"+ date1 +"']")); 
		SelDate.click();
		
	}
}

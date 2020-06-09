package com.EHR.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.EHR.Utility.base;

public class WebElementRepo extends base {
	JavascriptExecutor js = ((JavascriptExecutor) d);
	WebDriverWait wait1 = new WebDriverWait(d, 10);
	@FindBy(xpath = "//span[contains(text(),'Login')]")
	public static WebElement SignIn;

	@FindBy(name = "lid")

	public static WebElement UserName;

	@FindBy(name = "pwd")
	public static WebElement password;

	@FindBy(id = "signin_submit")
	public static WebElement login;

	@FindBy(id = "NEW_DIALOG_CLOSE_MARK")
	public static WebElement close_popup;

	@FindBy(xpath = "//div[@class='icon-grp']/i[@class='charts-menu-icon']")
	public static WebElement ChartNote;

	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public static WebElement Edit_Button;
	
	@FindBy(id="encounterTab_2")
	public static WebElement History;
	

	public WebElementRepo() {
		PageFactory.initElements(d, this);
	}

	public void login_inTo_EHR() {

		SignIn.click();
		UserName.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		login.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close_popup.click();
		js.executeScript("arguments[0].click();", ChartNote);

	}

	public void Navigate_To_patient_chart() throws InterruptedException {

		List<WebElement> row = d.findElements(By.xpath("//tbody[@id='chartRecords']//tr"));
		int rowcount = row.size();
		System.out.println(rowcount);
		String Before_xpath_title = "//*[@id='chartRecords']/tr[";
		String After_xpath_title = "]/td[1]";
		for (int j = 1; j <= rowcount; j++) {
			String actual_xpath_title = Before_xpath_title + j + After_xpath_title;
			String Patient_Title = d.findElement(By.xpath(actual_xpath_title)).getText();
			System.out.println(Patient_Title);
			String title = "Jun 05, 2020 : Dr.Akilesh Bapu : New Patient Visit : In Person";

			Thread.sleep(2000);

			if (d.findElement(By.xpath(actual_xpath_title)).getText().equals(title)) {
				d.findElement(By.xpath(actual_xpath_title)).click();
			}
		}
	}

	public void Click_Edit() {
		Edit_Button.click();
	}
	
	public void  Edit_History()
	{
		js.executeScript("arguments[0].click();", History);
		

		
		
	}

}

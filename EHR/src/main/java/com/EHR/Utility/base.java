package com.EHR.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class base {

	public static Properties prop;
	public static WebDriver d;
	//JSONParser parser = new JSONParser();

	public base() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:\\Eclipse_Neon\\Eclipse\\EHR\\src\\main\\java\\com\\EHR\\Config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		/*try {
			Object obj = parser.parse(new FileReader("/training/training/student.json"));
			JSONObject jsonObject = (JSONObject) obj;
			//String url = (String) jsonObject.get("url");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ParseException e) {

			e.printStackTrace();
		}*/

	}

	public static void intialization() {
		String Browsername = prop.getProperty("browser");
		if (Browsername.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Eclipse_Neon\\Eclipse\\Seleneium-Revision\\Drivers\\ChromeDriver\\chromedriver.exe");
			d = new ChromeDriver();
		}

		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().pageLoadTimeout(TestUtils.page_load_time_out, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(TestUtils.implicit_wait, TimeUnit.SECONDS);
		d.get(prop.getProperty("url"));

	}

}

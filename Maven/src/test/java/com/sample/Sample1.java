package com.sample;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.*;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ByClassName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Argument;

public class Sample1{
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\Maven\\Drivert\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.goibibo.com/");
	WebDriverWait wait=new WebDriverWait(driver, 10000);
	driver.manage().window().maximize();
	WebElement trip = driver.findElement(By.id("roundTrip"));
	trip.click();
	WebElement from = driver.findElement(By.className("inputSrch"));
	from.sendKeys("chennai");
	Thread.sleep(5000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement des = driver.findElement(By.id("gosuggest_inputDest"));
	des.sendKeys("trichy");
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement date = driver.findElement(By.id("departureCalendar"));
	date.click();
	
}
}
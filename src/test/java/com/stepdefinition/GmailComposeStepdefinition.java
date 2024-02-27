package com.stepdefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailComposeStepdefinition extends BaseClass
{
	
	

@Given("User is on Gmail signin page")
public void user_is_on_gmail_signin_page()

{
	browserLaunch("chrome");
	urlGo("https:www.gmail.com");
	
}

@When("User enter valid {string} in the email field")
public void user_enter_valid_in_the_email_field(String string)
{
	
	 driver.findElement(By.id("identifierId")).sendKeys("francesjisha@gmail.com");  
}
    

@When("User click the next button")
public void user_click_the_next_button() 
{
	driver.findElement(By.xpath("//span[text()='Next']")).click();

}

@When("User enter valid {string} in the password field")
public void user_enter_valid_in_the_password_field(String string) 
{
	 driver.findElement(By.name("Passwd")).sendKeys("jishajane2914");
	 
}
    


@When("User enter again next button")
public void user_enter_again_next_button()
{
	WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(30));
	
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@jsname='V67aGc'])[3]")));
			
	driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[3]")).click();

	
}

@When("User click a compose function")
public void user_click_a_compose_function()
{
	driver.findElement(By.xpath("//div[@style='user-select: none']")).click();	
	
}
    

@When("User enter subject of the email")
public void user_enter_subject_of_the_email() 
{
	driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Incubyte");
}

@When("User enter text in message body")
public void user_enter_text_in_message_body() 
{
	driver.findElement(By.xpath("//div[contains(@aria-label,'Message Body')]")).sendKeys("Automation QA test for Incubyte");

}

@Then("User add recipient detail")
public void user_add_recipient_detail() 
{

//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(45));
//	
//	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[text()='Recipients']")));

	driver.findElement(By.xpath("//div[text()='Recipients']")).sendKeys("steffy0305@gmail.com");
	

	
}

@Then("User send message sucessfully")
public void user_send_message_sucessfully()
{

	driver.findElement(By.xpath("(//div[@tabindex='1'])[2]")).click();	
}
}



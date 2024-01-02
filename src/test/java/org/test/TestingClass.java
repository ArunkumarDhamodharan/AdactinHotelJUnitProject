package org.test;

import org.base.BaseClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.page.PageClass;

public class TestingClass extends BaseClass {
	
	@Test
	public void tc01() {
		try {
			getDriver("Chrome");
			windMax();
			Thread.sleep(3000);
			getUrl("https://adactinhotelapp.com/");
			
			System.out.println("Browser and Url Launched Successfull");
		} catch (Exception e) {
			System.out.println("Browser and Url Not Launched");
		}
	}
	@Test
	public void tc02() {
		try {
			PageClass a= new PageClass();
			WebElement username = a.getUsername();
			username.sendKeys("arunkumar2003");
			WebElement passWord = a.getPassWord();
			passWord.sendKeys("6KL5W0");
			WebElement login = a.getLogin();
			login.click();
			Thread.sleep(1000);
			
			System.out.println("UserName and Password Entered");
		} catch (Exception e) {
			System.out.println("UserName and Password Not Entered");
		}
	}
	@Test
	public void tc03() {
		PageClass a=new PageClass();
		
		WebElement location = a.getLocation();
		selectMethod(location, "London");
		
		WebElement hotel = a.getHotel();
		selectMethod(hotel, "Hotel Creek");
		
		WebElement roomType = a.getRoomType();
		selectMethod(roomType, "Standard");
		
		WebElement noOfRoom = a.getNoOfRoom();
		selectMethod(noOfRoom, "3 - Three");
		
		WebElement fromDate = a.getFromDate();
		fromDate.clear();
		fromDate.sendKeys("04/01/2024");
		
		WebElement outDate = a.getOutDate();
		outDate.clear();
		outDate.sendKeys("08/01/2024");
		
		WebElement adultRoom = a.getAdultRoom();
		selectMethod(adultRoom, "2 - Two");
		
		WebElement childRoom = a.getChildRoom();
		selectMethod(childRoom, "2 - Two");
		
		WebElement search = a.getSearch();
		search.click();
	}
	@Test
	public void tc04() {
		PageClass a=new PageClass();
		
		WebElement radio = a.getRadio();
		radio.click();
		
		WebElement continue1 = a.getContinue1();
		continue1.click();
	}
	@Test
	public void tc05() {
		PageClass a=new PageClass();
		
		WebElement firstName = a.getFirstName();
		firstName.sendKeys("Arunkumar");
		
		WebElement lastName = a.getLastName();
		lastName.sendKeys("Dhamodharan");
		
		WebElement address = a.getAddress();
		address.sendKeys("Karur");
		
		WebElement cardNo = a.getCardNo();
		cardNo.sendKeys("7896758769876875");
		
		WebElement cardType = a.getCardType();
		selectMethod(cardType, "VISA");
		
		WebElement mont = a.getMont();
		selectMethod(mont, "March");
		
		WebElement year = a.getYear();
		selectMethod(year, "2027");
		
		WebElement cvvNo = a.getCvvNo();
		cvvNo.sendKeys("0459");
		
		WebElement bookNow = a.getBookNow();
		bookNow.click();
	}
}
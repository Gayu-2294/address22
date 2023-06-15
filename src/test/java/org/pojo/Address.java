package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address extends BaseClass{
	public Address() {
		PageFactory.initElements(driver, this);
	}
@CacheLookup
@FindBy(xpath="//span[@id ='glow-ingress-line2']")
private WebElement address;
public WebElement getAddress() {
	return address;
}
@CacheLookup
@FindBy(xpath="//input[@id='GLUXZipUpdateInput']")
private WebElement code;
public WebElement getCode() {
	return code;
}
@CacheLookup
@FindBy(xpath="(//input[@type ='submit'])[4]")
private WebElement button;
public WebElement getButton() {
	return button;
}

}
